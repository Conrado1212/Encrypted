package stage2.strings;

import java.util.Scanner;

public class string4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String num = scanner.next();
        int middle = num.length() / 2;
        String part1 = num.substring(0, middle);
        String part2 = num.substring(middle);

        int part1sum = 0;
        for (Character part1char : part1.toCharArray()) {
            part1sum += Integer.valueOf(part1char.toString());
        }

        int part2sum = 0;
        for (Character part2char : part2.toCharArray()) {
            part2sum += Integer.valueOf(part2char.toString());
        }

        if (part1sum == part2sum) {
            System.out.println("Lucky");
        } else {
            System.out.println("Regular");
        }
    }
}
/* Scanner sc = new Scanner(System.in);
        String ticketNum = sc.nextLine();
        String subStr1 = ticketNum.substring(0, 3);
        String subStr2 = ticketNum.substring(3, 6);
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < ticketNum.length() / 2; i++) {
            sum1 += subStr1.charAt(i);
            sum2 += subStr2.charAt(i);
        }
        System.out.println((sum1 == sum2) ? "Lucky" : "Regular");

 */
