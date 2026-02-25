package L12_MethodOverload;

class Printer {

    public void print(int a) {
        System.out.println("Inside print1 int");
    }

    public void print(double a) {
        System.out.println("Inside print2 double");
    }

    public void print(String a) {
        System.out.println("Inside print3 String");
    }

    public void print(int a, float b) {
        System.out.println("Inside print4 int & float");
    }

    public void print(String a, double b) {
        System.out.println("Inside print5 String & double");
    }

    public void print(int a, float b, String c) {
        System.out.println("Inside print6 int, float, String");
    }

    public void print(String a, float b, int c) {
        System.out.println("Inside print7 String, float, int");
    }
}

public class L01_MethodOverload1 {

    public static void main(String[] args) {

        Printer p = new Printer();

        p.print(10);
        p.print(5.5);
        p.print("Hello");
        p.print(10, 2.5f);
        p.print("Java", 3.14);
        p.print(1, 2.2f, "Test");
        p.print("Code", 4.5f, 7);
    }
}