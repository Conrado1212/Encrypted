package stage2;

import java.util.Scanner;

public class Encrypted2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine() ;

        StringBuffer reverse = new StringBuffer();
        int move = scanner.nextInt();
        for(int i =0;i<text.length();i++) {
            char x = text.charAt(i);
            if (Character.isLetter(x)) {
                x = (char) (text.charAt(i) + move);

               if((Character.isLowerCase(text.charAt(i)) && (x>'z'))
                       ||(Character.isUpperCase(text.charAt(i))&& (x >'Z'))){
                   x = (char) (text.charAt(i) - (26 - move));
               }


            }  reverse.append(x);
        }
        System.out.println(reverse);

    }
}

/*Scanner scanner = new Scanner(System.in);
        char[] chars = scanner.nextLine().toCharArray();
        int shift = scanner.nextInt();

        char a = 'a';
        char z = 'z';
        int size = 26;

        for (char item : chars) {
            if (item >= a && item <= z) {
                char shiftItem = (char) (((item - a + shift) % size) + a);
                System.out.print(shiftItem);
            } else {
                System.out.print(item);
            }
        }

 */