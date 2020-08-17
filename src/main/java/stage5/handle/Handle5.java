package stage5.handle;

import java.util.Scanner;

public class Handle5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String input = scanner.next();

            try {
                if(Integer.parseInt(input) == 0){
                    break;
                }
                System.out.println(Integer.parseInt(input) * 10);
            } catch (NumberFormatException e) {
                System.out.println("Invalid user input: " + input);
            }

        }
    }
}
/*
public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        while (true) {
            String line = null;
            try {
                line = scanner.nextLine();
                int val = Integer.parseInt(line);

                if (val == 0) {
                    break;
                }

                System.out.println(val * 10);
            } catch (Exception e) {
                System.out.println("Invalid user input: " + line);
            }
        }
    }
}

 */