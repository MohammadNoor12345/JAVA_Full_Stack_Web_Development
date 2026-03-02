package L16_Abstraction;

// Level 1
abstract class Bike {

    public abstract void ignite();
    public abstract void changeGear();
    public abstract void accelerate();
    public abstract void applyBrake();
}

// Level 2
abstract class SportsBike extends Bike {


}

// Level 3
abstract class ElectricBike extends SportsBike {

    @Override
    public abstract void ignite();

    @Override
    public abstract void changeGear();

    @Override
    public abstract void accelerate();

    @Override
    public abstract void applyBrake();
}

// Final Concrete Class
class TeslaBike extends ElectricBike {

    @Override
    public void ignite() {
        System.out.println("Tesla Bike Powered On");
    }

    @Override
    public void changeGear() {
        System.out.println("Tesla Bike Automatic Gear System");
    }

    @Override
    public void accelerate() {
        System.out.println("Tesla Bike Accelerating Silently");
    }

    @Override
    public void applyBrake() {
        System.out.println("Tesla Bike Applying Regenerative Brake");
    }
}

public class L03_MyGarage {

    public static void main(String[] args) {

        Bike b = new TeslaBike();

        b.ignite();
        b.changeGear();
        b.accelerate();
        b.applyBrake();
    }
}