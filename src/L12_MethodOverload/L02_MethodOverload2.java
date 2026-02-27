package L12_MethodOverload;

class Calculator {

    void add(int a) {
        int c = 10 + a;
        System.out.println("Inside int add");
    }

    void add(float b) {
        float d = 10.5f + b;
        System.out.println("Inside float add");
    }

    void add(double m) {
        double n = 20.5 + m;
        System.out.println("Inside double add");
    }

    void add(int a, int b) {
        int c = a + b;
        System.out.println("Inside int, int add");
    }

    void add(int a, float b) {
        float d = a + b;
        System.out.println("Inside int, float add");
    }

    void add(int a, int b, float c) {
        float g = a + b + c;
        System.out.println("Inside int, int, float add");
    }
}

public class L02_MethodOverload2 {

    public static void main(String[] args) {

        Calculator cal = new Calculator();

        cal.add(5);
        cal.add(5.5f);
        cal.add(10.2);
        cal.add(4, 6);
        cal.add(3, 4.5f);
        cal.add(2, 3, 4.5f);
    }
}