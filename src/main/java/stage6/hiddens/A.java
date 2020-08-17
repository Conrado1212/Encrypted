package stage6.hiddens;

public class A {

    public void print() {
        System.out.println("A");
    }
}

class B extends A {

    @Override
    public void print() {
        System.out.println("B");
    }
}

class C extends B { }

class D extends C {

    @Override
    public void print() {
        System.out.println("D");
    }

    public static void main(String[] args) {
        C c = new C();


        c.print();
    }
}
