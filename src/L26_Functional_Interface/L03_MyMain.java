package L26_Functional_Interface;
@FunctionalInterface
interface Calc {
    int mul(int a, int b);

    //    int add(int m, int n);
    default void add() {

    }

    default void add1() {
    }

    default void add2() {
    }
}

public class L03_MyMain {
    static void main(String[] args) {
//        Calc m1 = (int a, int b) -> a * b;
        Calc m1 = (a, b) -> a * b;
        // Lambda function can be written for functional interface only
        int res = m1.mul(10, 20);
        System.out.println("Multiplication is: " + res);
    }
}
