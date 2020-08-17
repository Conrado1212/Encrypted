package stage5.handle;

import java.util.Scanner;

public class Handle3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String input = scanner.nextLine();
            try {
                System.out.println(Integer.parseInt(input) * 10);

            } catch (NumberFormatException e) {
                System.out.println("Invalid user input: " + input);
            }
        }
    }
}
