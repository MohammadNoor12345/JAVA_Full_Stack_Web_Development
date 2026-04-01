package L26_Functional_Interface;
interface Opens{
    void add(int a, int b);
}
/*class calc implements Opens{
    public void add(int a, int b){
        int c = a+b;
        System.out.println("Sum is: "+c);
    }
}*/

public class L01_MyFunctionInterface {
    static void main(String[] args) {
//        calc c = new calc();
//        c.add(100,200);
        Opens op = (int a, int b) -> {
            int c = a + b;
            System.out.println("Sum is: " + c);
        };

        op.add(100, 200);
    }
}
