package L14_Inheritance;

class Bank {
    public void roi() {
        System.out.println("6.5%");
    }


    public static void withdraw() {
        System.out.println("Bank allows to withdraw");
    }
}

class SBI extends Bank {
    @Override
    public void roi() {
        System.out.println("8.5%");
    }
}

public class L05_MethodOverriding {

    public static void main(String[] args) {

        Bank b = new Bank();
        b.roi();   // 6.5%

        Bank s = new SBI();   // Upcasting
        s.roi();   // 8.5% (Runtime Polymorphism)
        SBI.withdraw();
    }
}