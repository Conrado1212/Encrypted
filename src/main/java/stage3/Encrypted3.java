package stage3;

import java.util.Scanner;

public class Encrypted3 {
    enum Status {
        CHOOSE, enc, dec
    }

    static Status status = Status.CHOOSE;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String menu = scanner.nextLine();
        String text = scanner.nextLine();
        int move = scanner.nextInt();
        String status1 ="";
        switch (menu) {
            case "enc":
                status = Status.enc;
                status1= enc(text,move);
                break;
            case "dec":
                status = Status.dec;
                status1 =  dec(text,move);
                break;
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
/*  Scanner scanner = new Scanner(System.in);
        String operation = scanner.nextLine();
        char[] chars = scanner.nextLine().toCharArray();
        int shift = scanner.nextInt();
        switch (operation) {
            case "enc":
                getEncryption(chars, shift);
                break;
            case "dec":
                getDecryption(chars, shift);
                break;
            default:
                System.out.println("Unknown operation");
                break;
        }
    }

    public static void getDecryption(char[] chars, int shift) {
        for (char item : chars) {
            char shiftItem = (char) (item - shift);
            System.out.print(shiftItem);

        }
    }

    public static void getEncryption(char[] chars, int shift) {
        for (char item : chars) {
            char shiftItem = (char) (item + shift);
            System.out.print(shiftItem);
        }

 */