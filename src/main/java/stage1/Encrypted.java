package stage1;

import java.awt.*;

public class Encrypted {
    final static int ALPHABET_LOWER_BOUND = 'a';
    final static int ALPHABET_UPPER_BOUND = 'z';
    public static void main(String[] args) {
       //String text = "we found a treasure!" ;
       String text = "welcome to hyperskill" ;

    StringBuffer reverse = new StringBuffer();

       for(int i =0;i<text.length();i++){
           char x = text.charAt(i);
        int code = x;
        char newChar = (code >= ALPHABET_LOWER_BOUND && code <=ALPHABET_UPPER_BOUND)
                ? (char) (ALPHABET_UPPER_BOUND - x + ALPHABET_LOWER_BOUND) : x;
        reverse.append(newChar);

       }
        System.out.println(reverse.toString());

    }
}
   /* public static void main(String[] args) {
        for (char c : "we found a treasure!".toLowerCase().toCharArray()) {
            System.out.print(c >= 'a' && c <= 'z' ? (char) ('z' - c + 'a') : c);
        }
    }

    
    */