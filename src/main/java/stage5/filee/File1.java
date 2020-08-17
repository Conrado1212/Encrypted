package stage5.filee;

import java.util.Scanner;

public class File1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while(scanner.hasNext()){
            if(scanner.nextInt()>=9999){

                count++;
            }
            System.out.println(count);

        }

    }
}
