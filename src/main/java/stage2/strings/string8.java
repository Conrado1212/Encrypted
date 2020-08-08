package stage2.strings;

import java.util.Scanner;

public class string8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.next();
        int n = scanner.nextInt();
        char[] chars = line.toCharArray();
        if (n > chars.length) {
            System.out.println(line);
        } else if (n < chars.length) {
            char[] lineBefore = new char[n];
            char[] lineAfter = new char[line.length() - n];

            for (int i = 0; i < n; i++) {
                lineBefore[i] = chars[i];
                System.out.println(lineBefore);
            }

            for (int j = 0; j < lineAfter.length; j++) {
                lineAfter[j] = chars[n + j];
                System.out.println(lineAfter);
            }

            System.out.print(lineAfter);
            System.out.print(lineBefore);
        }
    }

}
/*
Scanner scanner = new Scanner(System.in);

        String str = scanner.next();
        int offset = scanner.nextInt();

        if (offset < str.length()) {
            System.out.print(str.substring(offset) + str.substring(0, offset));
        } else {
            System.out.println(str);
        }
 */