package stage2.strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class string12 {
    public static void main(String[] args) {
        System.out.println("Enter a string:");
        Scanner IO = new Scanner(System.in);
        // read in user input
        String userString = IO.nextLine() + "-";

        int length = userString.length();

        int count = 0;
        String result = "";
        char new_char;

        for (int i = 0; i < length; i++) {
            new_char = userString.charAt(i);
            count++;
            if (new_char != userString.charAt(i + 1)) {
                if (count != 1) {
                    result = result.concat(Integer.toString(count + 1));
                }
                result = result.concat(Character.toString(new_char));
                count = 0;
            }
            if (userString.charAt(i + 1) == '-')
                break;
        }

        System.out.println(result);
    }
}
