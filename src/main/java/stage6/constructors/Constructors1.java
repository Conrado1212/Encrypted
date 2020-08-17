package stage6.constructors;

public class Constructors1 {
    int val = 1;

    public Constructors1() {
        val = 2;
    }

    public Constructors1(int val) {
        this();
    }

    public Constructors1(int val1, int val2) {
        this(val1 + val2);
    }

    public static void main(String[] args) {
        Constructors1 myInt = new Constructors1(3);
        System.out.println(myInt);
    }
}
