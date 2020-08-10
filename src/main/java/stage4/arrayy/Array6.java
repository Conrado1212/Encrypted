package stage4.arrayy;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Array6 {
    private static int[] getFirstAndLast(int[] array) {
       return new int[]{array[0],array[array.length-1]};

    }

    public static void main(String[] args) {
       /* List<String> games = Arrays.asList("1","2","4");

        String first = games.get(0);
        String lasft = games.get(games.size()-1);

        System.out.println(first);
        System.out.println(lasft);*/


        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] result = getFirstAndLast(array);
        Arrays.stream(result).forEach(e -> System.out.print(e + " "));
    }


}
/*
 int[] arr = new int[2];
        arr[0] = array[0];
        arr[1] = array[array.length - 1];
        return arr;
 */