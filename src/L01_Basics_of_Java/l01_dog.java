package L01_Basics_of_Java;
public class l01_dog {
        String name;
        String breed;
        int age;
        String color;

        public void eat() {
            System.out.println("Dog is eating");
        }

        public void bark() {
            System.out.println("Dog is barking");
        }

        public static void main(String[] args) {
            l01_dog d = new l01_dog(); // create object
            d.eat();   // call method
            d.bark();  // call method
        }
    }


