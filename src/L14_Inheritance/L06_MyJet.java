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
class Airpot {
    static void permit(Plane p) {
        System.out.println("Airport is allowing the planes inside permit()");
        p.takeoff();
        p.fly();
        p.land();
        System.out.println();
    }
}

public class L06_MyJet {

    public static void main(String[] args) {

//        CargoPlane cp = new CargoPlane();
//        cp.takeoff();
//        cp.fly();
//        cp.carryGoods();
//        cp.land();
//
//        System.out.println("-----");
//
//        PassengerPlane pp = new PassengerPlane();
//        pp.takeoff();
//        pp.fly();
//        pp.carryPassengers();
//        pp.land();
//
//        System.out.println("-----");
//
//        FighterPlane fp = new FighterPlane();
//        fp.takeoff();
//        fp.fly();
//        fp.fight();
//        fp.land();

/*
        // This is Dynamic polymorphism
        Plane p;
        CargoPlane cp = new CargoPlane();
        p = cp;
        p.fly();
        ((CargoPlane)p).carryGoods(); // downcasted
        PassengerPlane pp = new PassengerPlane();
        p = pp;
        p.fly();
        ((PassengerPlane)p).carryPassengers();  // downcasted
        FighterPlane fp = new FighterPlane();
        p = fp;
        p.fly();
        ((FighterPlane)p).fight();// downcasted*/

         CargoPlane cp= new CargoPlane();
         PassengerPlane pp = new PassengerPlane();
         FighterPlane fp = new FighterPlane();

         Airpot.permit(cp);
        Airpot.permit(pp);
        Airpot.permit(fp);
    }
}

// for a class we need two access modifier are allow public and default(Package)
