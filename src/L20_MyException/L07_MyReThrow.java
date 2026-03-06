package L20_MyException;

import java.util.Scanner;

class MyATM{
    public void m1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Connection established");
        try {

            // Asking user to enter first number
            System.out.println("Enter a:");
            int a = sc.nextInt();

            // Asking user to enter second number
            System.out.println("Enter b:");
            int b = sc.nextInt();

            // Risky statement
            // If b = 0 → ArithmeticException will occur
            int c = a / b;

            // If no exception occurs, result will print
            System.out.println("Result of a/b is " + c);
        }

        catch (Exception e) {

            // This block executes if any exception occurs in try block
            System.out.println("Sorry for inconvenience. we ll get back soon");

            // Rethrowing the exception
            // Exception is sent back to JVM or calling method
            throw e;
        }

        finally {

            // finally block always executes
            // Whether exception occurs or not
            System.out.println("Connection terminated");

            // Closing the Scanner to release resources
            sc.close();
        }
    }

}

public class L07_MyReThrow {
    public static void main(String[] args) {

        MyATM m = new MyATM();
        try {
            m.m1();
        } catch (Exception e) {
            System.out.println("Exception caught in main");
//			e.printStackTrace();
        }

    }
}
