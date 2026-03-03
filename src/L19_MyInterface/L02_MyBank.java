package L19_MyInterface;

import java.util.Scanner;

interface ATM {

    void withdraw(double amount);
    void deposit(double amount);
}

class SBI implements ATM {

    double balance = 10000;

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("SBI: Withdraw successful. Remaining balance = " + balance);
        } else {
            System.out.println("SBI: Insufficient balance.");
        }
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("SBI: Deposit successful. Updated balance = " + balance);
    }
}

class Canara implements ATM {

    double balance = 20000;

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Canara: Withdraw successful. Remaining balance = " + balance);
        } else {
            System.out.println("Canara: Insufficient balance.");
        }
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Canara: Deposit successful. Updated balance = " + balance);
    }
}

class Axis implements ATM {

    double balance = 15000;

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Axis: Withdraw successful. Remaining balance = " + balance);
        } else {
            System.out.println("Axis: Insufficient balance.");
        }
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Axis: Deposit successful. Updated balance = " + balance);
    }
}

public class L02_MyBank {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Bank: 1.SBI  2.Canara  3.Axis");
        int choice = sc.nextInt();

        ATM atm = null;

        if (choice == 1) {
            atm = new SBI();
        } else if (choice == 2) {
            atm = new Canara();
        } else if (choice == 3) {
            atm = new Axis();
        } else {
            System.out.println("Invalid choice");
            System.exit(0);
        }

        System.out.println("1.Withdraw  2.Deposit");
        int operation = sc.nextInt();

        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();

        if (operation == 1) {
            atm.withdraw(amount);
        } else if (operation == 2) {
            atm.deposit(amount);
        } else {
            System.out.println("Invalid operation");
        }

        sc.close();
    }
}