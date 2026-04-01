package L26_Functional_Interface;
@FunctionalInterface
interface Calc{
    int mul(int a, int b);
//    int add(int m, int n);
}

public class L03_MyMain {
    static void main(String[] args) {
//        Calc m1 = (int a, int b) -> a * b;
        Calc m1 = (a, b) -> a * b;
        int res = m1.mul(10, 20);
        System.out.println("Multiplication is: " + res);
    }
}
