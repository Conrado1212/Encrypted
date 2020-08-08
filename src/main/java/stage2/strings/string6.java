package stage2.strings;

import java.util.Scanner;

public class string6 {
    public static void main(String[] args) {


        boolean flag = true;
        char prev = 0;

        for (char c : new Scanner(System.in).next().toCharArray()) {
            if (prev != 0 && c - 1 != prev) {
                flag = false;
                break;
            }
            prev = c;
        }

        System.out.println(flag);
    }
}
