package stage4.line;

public class line3 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No arguments are passed");
        } else {

            int a = Integer.parseInt(args[0]);
            String p = args[1];
            int b = Integer.parseInt(args[2]);

            switch (p) {
                case "+":
                    System.out.println(a + b);
                    break;

                case "-":
                    System.out.println( a - b);
                    break;

                case "*":
                    System.out.println(a * b);
                    break;


                default:
                    System.out.println("Unknown operator!");
            }
        }
    }
}
