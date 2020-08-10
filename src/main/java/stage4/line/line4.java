package stage4.line;

public class line4 {
    public static void main(String[] args) {
        String operator = args[0];
        int result = Integer.parseInt(args[1]);
        if ("MAX".equals(operator)) {
            for (int i = 1; i < args.length; i++) {
                if (Integer.parseInt(args[i]) >= result) {
                    result = Integer.parseInt(args[i]);
                }
            }
            System.out.println(result);
        } else if ("MIN".equals(operator)) {
            for (int i = 1; i < args.length; i++) {
                if (Integer.parseInt(args[i]) < result) {
                    result = Integer.parseInt(args[i]);
                }
            }
            System.out.println(result);
        } else if ("SUM".equals(operator)) {
            for (int i = 2; i < args.length; i++) {
                result += Integer.parseInt(args[i]);
            }
            System.out.println(result);
        } else {
            System.out.println("Unknown operator");
        }

    }
}

/*int max = Integer.parseInt(args[1]);
        int min = Integer.parseInt(args[1]);
        int sum = 0;

        for (int i = 1; i < args.length; i++) {
            sum += Integer.parseInt(args[i]);

            if (Integer.parseInt(args[i]) > max) {
                max = Integer.parseInt(args[i]);

            } else if (Integer.parseInt(args[i]) < min) {
                min = Integer.parseInt(args[i]);
            }
        }

        if (args[0].equals("MAX")) {
            System.out.println(max);
        } else if (args[0].equals("MIN")) {
            System.out.println(min);
        } else {
            System.out.println(sum);
        }

 */