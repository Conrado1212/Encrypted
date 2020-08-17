package stage5.handle;

import java.util.Scanner;

public class Handl4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
int input = scanner.nextInt();
        while (input !=0) {

            try {
                System.out.println(Integer.parseInt(String.valueOf(input)) * 10);
            } catch (NumberFormatException e) {
                System.out.println("Invalid user input: " + input);
            }

        }
    }
}
