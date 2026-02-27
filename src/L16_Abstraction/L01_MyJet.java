package L16_Abstraction;

class Plane {

    public void takeoff() {
        System.out.println("Plane is taking off");
    }

    public void fly() {
        System.out.println("Plane is flying");
    }

    public void land() {
        System.out.println("Plane is landing");
    }
}

class CargoPlane extends Plane {

    @Override
    public void takeoff() {
        System.out.println("CargoPlane needs a longer runway for takeoff");
    }

    @Override
    public void fly() {
        System.out.println("CargoPlane flies with heavy goods");
    }
}

class PassengerPlane extends Plane {

    @Override
    public void takeoff() {
        System.out.println("PassengerPlane smoothly takes off");
    }

    @Override
    public void fly() {
        System.out.println("PassengerPlane flies with passengers");
    }

    public void carryPassengers() {
        System.out.println("PassengerPlane carries passengers safely");
    }
}

class FighterPlane extends Plane {

    @Override
    public void takeoff() {
        System.out.println("FighterPlane takes off at high speed");
    }

    @Override
    public void fly() {
        System.out.println("FighterPlane flies at supersonic speed");
    }

    public void fight() {
        System.out.println("FighterPlane is ready to fight");
    }
}

public class L01_MyJet {

    public static void main(String[] args) {

        Plane p;

        p = new CargoPlane();
        p.takeoff();
        p.fly();
        p.land();

        System.out.println("-----");

        p = new PassengerPlane();
        p.takeoff();
        p.fly();
        p.land();

        System.out.println("-----");

        p = new FighterPlane();
        p.takeoff();
        p.fly();
        p.land();
    }
}