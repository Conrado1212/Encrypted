package stage5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Encrypted5 {
      public static void main(String[] args) {
         boolean encode = true;
         String mes = "";

        String menu ="enc";
        int x =0;
        String menu2="";
          String inFile = "";
          String inFileData = "";
          String outFile = "";
          String result;
        for(int i =0;i<args.length;i+=2) {
            switch (args[i]) {
                case "-menu":
                    encode = "enc".equals(args[i + 1]);
                    break;
                case "-x":
                    x = Integer.parseInt(args[i + 1]);
                    break;
                case "-menu2":
                    menu2 = args[i + 1];
                    break;
                case "-in":
                    inFile=args[i+1];
                    break;
                case "-out":
                    outFile=args[i+1];
                    break;
            }
            if(!inFile.isBlank()){
                try(Scanner scanner = new Scanner(new File(inFile))){
                }catch (FileNotFoundException e){
                    System.out.println("Not file");
                    break;
                }
            }
            mes  = !menu2.equals("")? menu2:inFileData;
        }
        if(encode){
            result=enc(mes,x);
        }else{
            result =dec(mes,x);
        }
        if(outFile.isBlank()){
            System.out.println(result);
        }else {
            try(FileWriter fileWriter = new FileWriter(new File(outFile))){
                fileWriter.write(result);
                fileWriter.flush();
            }catch(IOException e){
                System.out.println("Error");
            }
        }
    }

    private static String enc(String text,int move) {
        StringBuffer reverse = new StringBuffer();
      for(char x: text.toCharArray()){
            reverse.append((char)(x+move));
        }
        return reverse.toString();
    }

    public static  String dec(String text,int move){
        StringBuffer reverse = new StringBuffer();
        for(char x: text.toCharArray()){
            reverse.append((char)(x-move));
        }
        return reverse.toString();
    }
}

/*
 public static String getDataFromFile(String path) {
        String data = "";
        try (Scanner sc = new Scanner(new File(path))) {
            data = sc.nextLine();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error at getting data data from file");
        }
        return data;
    }

    public static void writeDataToFile(String what, String output) {
        try(FileWriter fw = new FileWriter(output)) {
            fw.write(what);
        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("Error at writing data in file");
        }
    }

    public static String encDec(String input, int key) {
        if (input.equals("") | key == 0) {
            System.out.println();
        }
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            int codeN = input.charAt(i) - 31;
            int newPos = (codeN + key) % 96;
            output.append((char) (newPos + 31));
        }
        return output.toString();
    }

    public static void main(String[] args) {
        Map<String, String> argPair = new HashMap<>();
        for (int i = 0; i < args.length; i += 2) {
            argPair.put(args[i], args[i + 1]);
        }

        String mode = argPair.get("-mode") == null ? "enc" : argPair.get("-mode");
        int key = argPair.get("-key") == null ? 0 : Integer.parseInt(argPair.get("-key"));
        String in = argPair.get("-in");
        String data = "";
        String out = argPair.get("-out");
        if (in != null & argPair.get("-data") == null) {
            data = getDataFromFile(in);
        }

        String result = "";
        switch (mode) {
            case "enc" :
                result = encDec(data, key);
                break;
            case "dec" :
                result = encDec(data, 96 - key);
                break;
            default:
                System.out.println("Error! Undefined statement");
        }

        if (out != null) {
            System.out.println(result);
            writeDataToFile(result, out);
        } else
            System.out.println(result);
    }
}
 */