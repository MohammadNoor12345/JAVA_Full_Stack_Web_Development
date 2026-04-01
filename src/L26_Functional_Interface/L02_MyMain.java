package L26_Functional_Interface;

interface Opns1 {
    int add(int a, int b);
}

public class L02_MyMain {
    public static void main(String[] args) {
        Opns1 m1 = (int a, int b) -> a + b;

//        Opns1 m1 = (int a, int b) -> {
//            int c = a + b;
//            return c;
//        };
//
        int res = m1.add(100, 200);
        System.out.println(res);
    }
}