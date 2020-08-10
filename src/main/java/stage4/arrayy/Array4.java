package stage4.arrayy;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Array4 {

    public static void sort(int[] numbers) {
        Arrays.sort(numbers);
        for(int i =0;i<numbers.length;i++){

        }
    }
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        String[] values = scanner.nextLine().split("\\s+");
        int[] numbers = Arrays.stream(values)
                .mapToInt(Integer::parseInt)
                .toArray();
        sort(numbers);
        Arrays.stream(numbers).forEach(e -> System.out.print(e + " "));
    }
}
