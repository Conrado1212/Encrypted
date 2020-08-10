package stage4.line;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class line2 {
 static   Scanner scanner =  new Scanner(System.in);
    public static void main(String[] args) {


        String menu = scanner.nextLine();
        switch (menu){
            case "+": {
                sum();
                break;
            }
            case "-": {
                diffrence();
                break;
            }
            case"*": {
                multiply();
                break;
            }
            default:{
                System.out.println("Unknown operator");
            }
        }

    }

    public static void sum(){
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a+b);
    }

    public static void diffrence(){
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a-b);
    }

    public static void multiply(){
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a*b);
    }
}
