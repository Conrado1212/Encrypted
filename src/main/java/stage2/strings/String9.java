package stage2.strings;

import java.util.Scanner;

public class String9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int n = scanner.nextInt();
        String password = "";

        for (int i = 0; i < a; i++) {
            if (i % 2 == 0) {
                password += "A";
            } else {
                password += "B";
            }
        }

        for (int i = 0; i < b; i++) {
            if (i % 2 == 0) {
                password += "a";
            } else {
                password += "b";
            }
        }

        for (int i = 0; i < c; i++) {
            if (i % 2 == 0) {
                password += "1";
            } else {
                password += "2";
            }
        }

        if (password.length() < n) {
            for (int i = password.length(); i < n; i++) {
                if (i % 2 == 0) {
                    password += "A";
                } else {
                    password += 0;
                }
            }
        }

        System.out.println(password);
    }
    }

