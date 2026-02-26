package L14_Inheritance;

class Dog {
    public void bark() {
        System.out.println("Dog is Barking");
    }
}

class Puppy extends Dog {

}

public class L04_Kennel {

    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.bark();
    }
}