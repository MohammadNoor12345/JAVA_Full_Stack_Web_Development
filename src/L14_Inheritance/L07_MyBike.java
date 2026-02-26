package L14_Inheritance;

class Bike {

    public void start() {
        System.out.println("Bike is starting");
    }

    public void ride() {
        System.out.println("Bike is riding");
    }

    public void stop() {
        System.out.println("Bike is stopping");
    }
}

class SuperBike extends Bike {

    public void highSpeed() {
        System.out.println("SuperBike runs at very high speed");
    }
}

class Moped extends Bike {

    public void lowFuelConsumption() {
        System.out.println("Moped gives high mileage");
    }
}

class ElectricBike extends Bike {

    public void charge() {
        System.out.println("ElectricBike is charging");
    }
}

public class L07_MyBike {

    public static void main(String[] args) {

        SuperBike sb = new SuperBike();
        sb.start();
        sb.ride();
        sb.highSpeed();
        sb.stop();

        System.out.println("-----");

        Moped m = new Moped();
        m.start();
        m.ride();
        m.lowFuelConsumption();
        m.stop();

        System.out.println("-----");

        ElectricBike eb = new ElectricBike();
        eb.start();
        eb.ride();
        eb.charge();
        eb.stop();
    }
}