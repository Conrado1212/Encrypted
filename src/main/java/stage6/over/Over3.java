package stage6.over;

public class Over3 {
    public static void method(short s) {
        System.out.println("short");
    }

    public static void method(byte b) {
        System.out.println("byte");
    }

    public static void method(int i) {
        System.out.println("int");
    }

    public static void method(long l) {
        System.out.println("long");
    }

    public static void main(String[] args) {
        method(10);
    }
}
