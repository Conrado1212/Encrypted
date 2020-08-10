package stage4.line;

public class line5 {
    public static void main(String[] args)
    {
        if(args.length==0)
        {
            System.out.println("No arguments are passed");
        }
        else
        {


            char p=args[0].charAt(0);
            int a=Integer.parseInt(args[1]);
            int b=Integer.parseInt(args[2]);

            switch(p)
            {
                case '+':
                    System.out.println((a+b));
                    break;

                case '-':
                    System.out.println((a-b));
                    break;

                case '*':
                    System.out.println((a*b));
                    break;

                default:
                    System.out.println("Unknown operator");
            }
        }
    }

}
/*int result = 0;
        switch (args[0]) {
            case "+":
                result = Integer.parseInt(args[1]) + Integer.parseInt(args[2]);
                System.out.println(result);
                break;
            case "-":
                result = Integer.parseInt(args[1]) - Integer.parseInt(args[2]);
                System.out.println(result);
                break;
            case "*":
                result = Integer.parseInt(args[1]) * Integer.parseInt(args[2]);
                System.out.println(result);
                break;
            default:
                System.out.println("Unknown operator");
                break;
        }

 */