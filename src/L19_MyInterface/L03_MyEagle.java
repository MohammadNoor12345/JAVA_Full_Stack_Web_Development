package L19_MyInterface;

interface Bird {
    void fly();
    void eat();
}

abstract class Eagle implements Bird {

    @Override
    public void fly() {
        System.out.println("Eagle flies at greater heights");
    }

}

class GoldenEagle extends Eagle {

    @Override
    public void eat() {
        System.out.println("Golden Eagle feeds on fish");
    }
}

class SerpentEagle extends Eagle {

    @Override
    public void eat() {
        System.out.println("Serpent Eagle feeds on snakes");
    }
}

public class L03_MyEagle {

    public static void main(String[] args) {

        Bird b1 = new GoldenEagle();
        b1.fly();
        b1.eat();

        System.out.println();

        Bird b2 = new SerpentEagle();
        b2.fly();
        b2.eat();
    }
}