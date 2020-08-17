package stage5.handle;

import java.util.Scanner;

public class Tesdt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        boolean isAscending = true;
        boolean isDescending = true;
        while (input != 0) {
            int old = input;
            input = scan.nextInt();
            if (isAscending && old > input && input != 0) {
                isAscending = false;
            }
            if (isDescending && old < input) {
                isDescending = false;
            }

        }
        System.out.println(isAscending || isDescending);
    }
}
