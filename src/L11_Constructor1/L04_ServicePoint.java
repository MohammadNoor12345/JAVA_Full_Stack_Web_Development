package L11_Constructor1;

class Bike {

    private String name;
    private double mileage;
    private int model;

    // Default Constructor
    public Bike() {
        this(2025);
        System.out.println("Inside default constructor");
    }

    // Model Constructor
    public Bike(int model) {
        this(30.0);
        this.model = model;
        System.out.println("Inside model constructor");
    }

    // Mileage Constructor
    public Bike(double mileage) {
        this.mileage = mileage;
        System.out.println("Inside mileage constructor");
    }

    // Name Constructor
    public Bike(String name) {
        this();
        this.name = name;
        System.out.println("Inside name constructor");
    }

    // Fully Parameterized Constructor
    public Bike(String name, double mileage, int model) {
        this.name = name;
        this.mileage = mileage;
        this.model = model;
        System.out.println("Inside fully parameterized constructor");
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getMileage() {
        return mileage;
    }

    public int getModel() {
        return model;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public void setModel(int model) {
        this.model = model;
    }
}

public class L04_ServicePoint {

    public static void main(String[] args) {

        //  Using Name Constructor (Constructor Chaining)
        Bike b1 = new Bike("Bullet");
        System.out.println(b1.getName() + " " + b1.getMileage() + " " + b1.getModel());

        System.out.println("-----------");

        //  Using Default Constructor
        Bike b2 = new Bike();
        b2.setName("Yamaha");
        b2.setMileage(40.5);
        System.out.println(b2.getName() + " " + b2.getMileage() + " " + b2.getModel());

        System.out.println("-----------");

        //  Using Fully Parameterized Constructor
        Bike b3 = new Bike("KTM", 35.0, 2024);
        System.out.println(b3.getName() + " " + b3.getMileage() + " " + b3.getModel());
    }
}