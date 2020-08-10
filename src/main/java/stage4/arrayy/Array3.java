package stage4.arrayy;

import java.util.Arrays;
import java.util.Scanner;

public class Array3 {
    private static void addValueByIndex(long[] array, int index, long value) {
        array[index]+=value;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToLong(Long::parseLong)
                .toArray();
        int index = scanner.nextInt();
        long value = scanner.nextLong();
        addValueByIndex(array, index, value);
        Arrays.stream(array).forEach(e -> System.out.print(e + " "));
    }


}
