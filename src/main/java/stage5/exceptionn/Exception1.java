package stage5.exceptionn;

public class Exception1 {
    public static void main(String[] args) {
        String s = "ten";            // 1
        int n = Integer.parseInt(s); // 2
        System.out.println(n);       // 3
        n += 20;                     // 4
        System.out.println(n);
    }
}
