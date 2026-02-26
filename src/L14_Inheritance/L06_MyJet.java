package L14_Inheritance;

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

    public void carryGoods() {
        System.out.println("CargoPlane carries goods");
    }
}

class PassengerPlane extends Plane {

    public void carryPassengers() {
        System.out.println("PassengerPlane carries passengers");
    }
}

class FighterPlane extends Plane {

    public void fight() {
        System.out.println("FighterPlane is ready to fight");
    }
}

public class L06_MyJet {

    public static void main(String[] args) {

        CargoPlane cp = new CargoPlane();
        cp.takeoff();
        cp.fly();
        cp.carryGoods();
        cp.land();

        System.out.println("-----");

        PassengerPlane pp = new PassengerPlane();
        pp.takeoff();
        pp.fly();
        pp.carryPassengers();
        pp.land();

        System.out.println("-----");

        FighterPlane fp = new FighterPlane();
        fp.takeoff();
        fp.fly();
        fp.fight();
        fp.land();
    }
}
