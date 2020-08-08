package stage2.strings;

import java.util.Scanner;

public class string7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String result = "";
        int i = 0;
        while (i < s.length()){
            char c = s.charAt(i);
            result = result + c + c;
            i++;
        }
        System.out.println(result);
    }
}
/*
Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.substring(i, i + 1) + str.substring(i, i + 1));
        }
 */