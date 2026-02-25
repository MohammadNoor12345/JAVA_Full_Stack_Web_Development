package L14_Inheritance;

// Father interface
interface Father {
    void writeWithRightHand();
}

// Mother interface
interface Mother {
    void writeWithLeftHand();
}

// Child implementing both (Multiple Inheritance)
class Child implements Father, Mother {

    @Override
    public void writeWithRightHand() {
        System.out.println("Child writes with right hand (Father's skill)");
    }

    @Override
    public void writeWithLeftHand() {
        System.out.println("Child writes with left hand (Mother's skill)");
    }
}

public class L03_Multiple {

    public static void main(String[] args) {

        Child c = new Child();

        c.writeWithRightHand();
        c.writeWithLeftHand();
    }
}