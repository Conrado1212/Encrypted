package stage2.strings;

import java.util.Scanner;

public class string10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userString = scanner.nextLine();
      int  count = 0;
        String results = "";

        for(int i=0;i<userString.length();){
            char begin = userString.charAt(i);
            for(int j=i+1; j<userString.length();j++){
                char next = userString.charAt(j);
                if(begin == next){
                    count++;
                }
                else{
                    break;
                }
            }
            i+= count+1;
            System.out.println(count);
            if(count>=0){
                String add = ""+ begin ;
                int tempcount = count +1;

                results+= add + tempcount;
            }
            else{
                results+= begin;
            }
            count=0;
        }
        System.out.println(results);
    }
    }
    /*
    Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        char[] arrOfChar = str.toCharArray();
        arrOfChar[0] = str.charAt(0);
        int count = 1;
        String res = "";

        for (int i = 1; i < arrOfChar.length; i++) {
            if (arrOfChar[i] == arrOfChar[i - 1]) {
                count++;
            } else {
                res = res.concat(String.valueOf(arrOfChar[i - 1]));
                res = res.concat(String.valueOf(count));
                count = 1;
            }
        }

        res = res.concat(String.valueOf(arrOfChar[arrOfChar.length - 1]));
        res = res.concat(String.valueOf(count));

        System.out.println(res);
     */



