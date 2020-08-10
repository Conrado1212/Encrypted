package stage4;


import stage3.Encrypted3;

public class Encrypted4 {


    public static void main(String[] args) {

        String menu ="enc";
        int x =0;
        String menu2="";
        for(int i =0;i<args.length;i+=2) {
            switch (args[i]) {
                case "-menu":
                    menu = args[i + 1];
                    break;
                case "-x":
                    x = Integer.parseInt(args[i + 1]);
                    break;
                case "-menu2":
                    menu2 = args[i + 1];
                    break;
            }
        }


        String status1 ="";
        switch (menu) {
            case "enc":
                status1= enc(menu2,x);
                break;
            case "dec":
                status1 =  dec(menu2,x);
                break;
            default:
                System.out.println("Unknown operator");
        }
        System.out.println(status1);
    }

    private static String enc(String text,int move) {
        StringBuffer reverse = new StringBuffer();
        for (int i = 0; i < text.length(); i++) {
            char x = (char) (text.charAt(i) + move);
            reverse.append(x);
        }
        return reverse.toString();
    }

    public static  String dec(String text,int move){
        StringBuffer reverse = new StringBuffer();
        for(int i =0;i<text.length();i++){
            char x = (char) (text.charAt(i) - move);
            reverse.append(x);
        }
        return reverse.toString();
    }
}

/*
  String mode = "enc";
        int key = 0;
        String data = "";

        for (int i = 0; i < args.length; i += 2) {
            if (args[i].equals("-mode")) {
                mode = args[i+1];

            } else if (args[i].equals("-key")) {
                key = Integer.parseInt(args[i+1]);

            } else if (args[i].equals("-data")) {
                data = args[i+1];
            }
        }

        switch (mode) {
            case "enc":
                getEncryption(data, key);
                break;
            case "dec":
                getDecryption(data, key);
                break;
        }
    }

    public static void getDecryption(String data, int key) {
        for (char item : data.toCharArray()) {
            char shiftItem = (char) (item - key);
            System.out.print(shiftItem);
        }
    }

    public static void getEncryption(String data, int key) {
        for (char item : data.toCharArray()) {
            char shiftItem = (char) (item + key);
            System.out.print(shiftItem);
        }
 */

