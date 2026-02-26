package L14_Inheritance;

class Dog {

    String name;
    int cost;
    String breed = "German Shepard";

    public Dog(String name) {
        System.out.println("Name Constructor");
        this.name = name;
    }

    public Dog(int cost) {
        this("Ruby");
        System.out.println("Cost Constructor");
        this.cost = cost;
    }

    public Dog(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    public  Dog() {
        this(1000);
        System.out.println("Dog Object is created");
    }

    public void bark() {
        System.out.println("Dog Barks loudly");
    }
}

class Puppy extends Dog {
    public Puppy() {
        super();
        System.out.println("Puppy object created");
    }

    @Override
    public void bark() {
        System.out.println("Puppy barks in very low voice");

    }
}

public class L04_Kennel {

    public static void main(String[] args) {
        Puppy p = new Puppy();
        System.out.println(p.breed);
        p.bark();
    }
}
// Dynamic polymorphism