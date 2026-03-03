package L19_MyInterface;

interface ATM {
    public abstract void withdraw();

    public abstract void deposit();

    int a = 100;
}

class SBI implements ATM {
    @Override
    public void withdraw() {
        System.out.println("WITHDRAWING FROM sbi...");
    }

    @Override
    public void deposit() {
        System.out.println("depositing in sbi...");
    }
    public void specialRoi(){
        System.out.println("SBI offers 85% ROI");
    }

}

class Canara implements ATM {

    @Override
    public void withdraw() {
        System.out.println("WITHDRAWING FROM Canara...");
    }

    @Override
    public void deposit() {
        System.out.println("depositing in Canara...");
    }
}

class Axis implements ATM {

    @Override
    public void withdraw() {
        System.out.println("WITHDRAWING FROM Axis...");
    }

    @Override
    public void deposit() {
        System.out.println("depositing in Axis...");
    }
}

class PlutoneMall {
    public static void getinstalled(ATM a) {
        a.withdraw();
        a.deposit();

    }
}

public class L02_MyBank {
    public static void main(String[] args) {

        ATM sb = new SBI();
        ATM c = new Canara();
        ATM a = new Axis();

        PlutoneMall.getinstalled(sb);
        PlutoneMall.getinstalled(c);
        PlutoneMall.getinstalled(a);

        a.deposit();
        a.withdraw();
        ((SBI) sb).specialRoi();
    }
}