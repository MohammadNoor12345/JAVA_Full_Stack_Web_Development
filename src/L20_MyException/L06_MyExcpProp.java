package L20_MyException;

import java.util.InputMismatchException;
import java.util.Scanner;

class Demo3 {

    public void m3() {

        // m3() pushed into Runtime Stack
        Scanner scan = new Scanner(System.in);

        System.out.println("Connection4 established");

        // Exception occurs here if user enters String instead of int
        System.out.println("Enter your age");
        int age = scan.nextInt();

        System.out.println("Age entered is " + age);

        // Since there is NO try-catch in m3(),
        // exception is NOT handled here
        // JVM pops m3() from stack
        // Exception propagates to m2()

        System.out.println("Connection4 terminated");
    }
}

class Demo2 {

    public void m2() {

        // m2() pushed into Runtime Stack
        System.out.println("Connection3 established");

        Demo3 d3 = new Demo3();

        // m3() is called
        d3.m3();

        // Since there is NO try-catch in m2(),
        // exception coming from m3() is NOT handled here
        // JVM pops m2() from stack
        // Exception propagates to m1()

        System.out.println("Connection3 terminated");
    }
}

class Demo1 {

    public void m1() {

        // m1() pushed into Runtime Stack
        System.out.println("Connection2 established");

        Demo2 d2 = new Demo2();

        try {
            // m2() is called
            d2.m2();
        }

        // Exception finally handled here
        catch (InputMismatchException e) {

            System.out.println("Input can't be String");
            System.out.println("Exception handled in m1()");
        }

        System.out.println("Connection2 terminated");
    }
}

public class L06_MyExcpProp {

    public static void main(String[] args) {

        // Program starts
        // main() pushed into Runtime Stack

        System.out.println("Connection1 established");

        Demo1 d1 = new Demo1();

        // m1() is called
        d1.m1();

        // After exception handled in m1(),
        // control returns to main()

        System.out.println("Connection1 terminated");
    }
}