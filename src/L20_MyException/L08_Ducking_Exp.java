package L20_MyException;

import java.util.Scanner;

class Demo5{

    // Step 3: This method does division
    // It may crash if user enters b = 0
    public void m5 () throws ArithmeticException {

        Scanner scan = new Scanner(System.in);

        System.out.println("Connection2 established");

        // Taking input
        System.out.println("Enter num a");
        int a = scan.nextInt();

        System.out.println("Enter num b");
        int b = scan.nextInt();

        // Risky line (can cause exception if b = 0)
        int c = a / b;

        System.out.println("Result: " + c);

        System.out.println("Connection2 terminated");

        scan.close();
    }
}

class Demo4{

    // Step 2: Calls m5()
    // Does NOT handle exception, just passes it to main()
    public void m4() throws ArithmeticException {

        Demo5 d5 = new Demo5();

        // Calling m5() (exception may come from here)
        d5.m5();
    }
}

public class L08_Ducking_Exp {

    public static void main(String[] args) {

        // Step 1: Starting point
        Demo4 d4 = new Demo4();

        try {
            // Calling m4() → which calls m5()
            d4.m4();
        }
        catch (Exception e) {
            // Step 4: Final handling of exception
            System.out.println("Exception handled in main()");
        }

    }
}