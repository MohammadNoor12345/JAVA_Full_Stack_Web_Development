package L16_Abstraction;

abstract class Plane2 {

    public abstract void takeoff();
    public abstract void fly();
    public abstract void land();
}

// Cargo Plane (Concrete Class)
class CargoPlane2 extends Plane2 {

    public void takeoff() {
        System.out.println("Cargo Plane Takeoff");
    }

    public void fly() {
        System.out.println("Cargo Plane is Flying");
    }

    public void land() {
        System.out.println("Cargo Plane Landing");
    }
}

// Fighter Plane
class FighterPlane2 extends Plane2 {

    public void takeoff() {
        System.out.println("Fighter Plane Takeoff");
    }

    public void fly() {
        System.out.println("Fighter Plane is Flying at High Speed");
    }

    public void land() {
        System.out.println("Fighter Plane Landing");
    }
}

// Jet Plane
class JetPlane2 extends Plane2 {

    public void takeoff() {
        System.out.println("Jet Plane Takeoff");
    }

    public void fly() {
        System.out.println("Jet Plane is Flying Smoothly");
    }

    public void land() {
        System.out.println("Jet Plane Landing");
    }
}

public class L02_JetPlane {

    public static void main(String[] args) {

        Plane2 p;

        p = new CargoPlane2();
        p.takeoff();
        p.fly();
        p.land();

        System.out.println("-----------");

        p = new FighterPlane2();
        p.takeoff();
        p.fly();
        p.land();

        System.out.println("-----------");

        p = new JetPlane2();
        p.takeoff();
        p.fly();
        p.land();
    }
}