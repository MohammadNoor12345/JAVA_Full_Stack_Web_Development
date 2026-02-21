package nooor;
public class L01_Calci {
    public int add () {
        int a = 1000, b = 3000;
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        L01_Calci c = new L01_Calci();
        int res = c.add();
        System.out.println("Sum is printed in main()" + res);
    }
}
