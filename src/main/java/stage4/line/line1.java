package stage4.line;

public class line1 {
    public static void main(String[] args) {
        for(int i=0;i<args.length-1;i+=2){
            System.out.println(args[i]+ "=" + args[i+1]);
        }
    }
}
/*
 for (int i = 0, j = 1; j < args.length; i += 2, j += 2) {
            System.out.println(args[i] + "=" + args[j]);
        }
 */