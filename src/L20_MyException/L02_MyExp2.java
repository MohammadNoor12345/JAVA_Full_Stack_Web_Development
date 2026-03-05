package L20_MyException;

import java.util.Scanner;

public class L02_MyExp2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Connection Established");

        try {
            System.out.println("Enter int a");
            int a = sc.nextInt();

            System.out.println("Enter int b");
            int b = sc.nextInt();

            int c = a / b;

            System.out.println("Result of a/b is : " + c);
        }
        catch (Exception e) {
            System.out.println("Division by zero is not allowed");
        }

        System.out.println("Connection Terminated");
    }
}