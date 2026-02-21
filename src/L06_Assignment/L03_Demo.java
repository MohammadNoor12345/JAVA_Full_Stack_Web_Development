package L06_Assignment;
// Pass by Value
public class L03_Demo {
    public int add (int x, int y) {
        x = 500;
        y = 300;
        int sum = x + y;
        System.out.println(x);
        System.out.println(y);
        return sum;
    }

    public static void main(String[] args) {
        L03_Demo d = new L03_Demo();
        int a = 100;
        int b = 200;
        System.out.println("Value of a before : " +a);
        System.out.println("Value of a before : " +b);

        int res = d.add(a,b); // go to the add method

        System.out.println(res);
        System.out.println("Value of a after : " +a);
        System.out.println("Value of a after : " +b);
    }
}
