package stage2.strings;


import java.util.Scanner;

public class strin5v2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a string: ");
        String str = in.nextLine();
        System.out.print("The middle character in the string: " + (str)+"\n");

            int position;
            int length;
            if (str.length() % 2 == 0) {
                position = str.length() / 2 - 1;
                length = 2;

            } else {
                position = str.length() / 2;
                length = 1;
            }
         //   return str.substring(position, position + length);
        }


}

