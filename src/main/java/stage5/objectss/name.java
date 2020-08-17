package stage5.objectss;

import java.util.Scanner;

public class name {
    public static String prepareFullName(String firstName, String lastName) {
        if(firstName == null && lastName==null){
            return "";
        }
        if(firstName != null && lastName != null){
            return firstName + " " + lastName;
        }
        if(firstName == null && lastName !=null){
            return lastName;
        }
        return firstName;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        String firstName = scanner.nextLine();
        firstName = "null".equals(firstName) ? null : firstName;

        String lastName = scanner.nextLine();
        lastName = "null".equals(lastName) ? null : lastName;

        System.out.println(prepareFullName(firstName, lastName));
    }
}
/*
String fullName = "";

        if (firstName != null) {
            fullName += firstName + " ";
        }

        if (lastName != null) {
            fullName += lastName;
        }

        return fullName.trim();
 */
