package L11_Constructor1;

class Car {

    String name;
    int cost;

    // Constructor 1
    public Car(String name) {
        this(100000);  // calling cost constructor
        System.out.println("Inside name constructor");
        this.name = name;
    }

    // Constructor 2
    public Car(int cost) {
        this();   // calling default constructor
        System.out.println("Inside cost constructor");
        this.cost = cost;
    }

    // Default Constructor
    public Car() {
        System.out.println("Inside default constructor");
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }
}

public class L03_Constructor3 {

    public static void main(String[] args) {

        Car c = new Car("BMW");

        System.out.println("Car Name: " + c.getName());
        System.out.println("Car Cost: " + c.getCost());
    }
}