package L06_Assignment;
// java does not support pass by referance
public class L04_Car1 {
    String brand;
    double cost;

    public void exchange (L04_Car1 a) {
        a.brand = "Maruti";
        a.cost = 250000.00;

    }

    public static void main(String[] args) {
        L04_Car1 c = new L04_Car1();
        c.brand = "Audi";
        c.cost = 2500000.00;

        System.out.println(c.brand);
        System.out.println(c.cost);
        c.exchange(c);
        System.out.println(c.brand);
        System.out.println(c.cost);
    }
}
