package stage5.filee;

public class Test {
    public static void main(String[] args) {
        int number = 101;
        if( ( "" + number ).contains( "0" ) ) {
            System.out.println( "contains the digit 0" );
        }
        String test =  "This is a sentence";
        String lastWord = test.substring(test.lastIndexOf(" ")+1);
        System.out.println(lastWord);
    }
}
