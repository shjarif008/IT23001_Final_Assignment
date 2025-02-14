class Example {
    static int staticVar = 10;
    final int finalVar = 20;

    static void staticMethod() {
        System.out.println("Static method");
    }

    final void finalMethod() {
        System.out.println("Final method");
    }
}

public class Main {
    public static void main(String[] args) {
        Example obj = new Example();
        System.out.println(obj.staticVar);
        obj.staticMethod();
    }
}
