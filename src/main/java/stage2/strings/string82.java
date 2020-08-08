package stage2.strings;

import java.util.Scanner;

public class string82 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String word = s.next();
        int n = s.nextInt();
        int l = word.length();
        if(n>l){
            System.out.println(s);
        }
        String sub = word.substring(0,n);
        word = word.substring(n,l);
        word += sub;

        System.out.println(word);
    }
    }

