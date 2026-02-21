package L06_Assignment;

public class L02_Car {

        String brand;
        double cost;

        public static void main(String[] args) {
            L02_Car c = new L02_Car();
            c.brand = "BMW";
            c.cost = 4500000.50;
            L02_Car b;
            b = c;
            System.out.println(c.brand);
            System.out.println(c.cost);
            System.out.println(b.brand);
            System.out.println(b.cost);

            b.brand = "NANO";
            b.cost = 2500000.80;
            System.out.println(c.brand);
            System.out.println(c.cost);
        }
    }

