package stage5.filee;

import java.util.Scanner;

public class File2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int count1 = 0;
        while(scanner.hasNext()){
            if(scanner.nextInt()%2==0){

                count++;
            }
         //   if (String.valueOf(scanner).contains("0")){
           //     count1++;
          //  }
            System.out.println(count);
          //  System.out.println(count1);
            if(scanner.nextInt()==0){
                break;
            }
        }
    }
}
