package L14_Inheritance;

class Atm {

    public void deposit() {
        System.out.println("Please deposit the cash");
    }

    public void withdraw() {
        System.out.println("Please withdraw the cash");
    }

    public void checkBalance() {
        System.out.println("Your balance is 10000 only");
    }
}

class SbiAtm extends Atm {

    public void showSbiOffers() {
        System.out.println("Showing SBI ATM offers");
    }
}

class AxisAtm extends Atm {

    public void showAxisOffers() {
        System.out.println("Showing Axis ATM offers");
    }
}

class CanaraAtm extends Atm {

    public void showCanaraOffers() {
        System.out.println("Showing Canara ATM offers");
    }
}

class RBI {

    static void permit(Atm a) {
        System.out.println("RBI is allowing the ATM inside permit()");
        a.deposit();
        a.withdraw();
        a.checkBalance();
        System.out.println();
    }
}

public class L08_Atm {

    public static void main(String[] args) {


        Atm a;
        SbiAtm sa = new SbiAtm();
        a = sa;
        a.deposit();

        AxisAtm aa = new AxisAtm();
        a = aa;
        a.deposit();

        CanaraAtm ca = new CanaraAtm();
        a = ca;
        a.deposit();


//        SbiAtm sa = new SbiAtm();
//        AxisAtm aa = new AxisAtm();
//        CanaraAtm ca = new CanaraAtm();
//
//        RBI.permit(sa);
//        RBI.permit(aa);
//        RBI.permit(ca);
    }
}