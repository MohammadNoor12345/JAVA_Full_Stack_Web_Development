package L23_MyException;

import java.util.Scanner;

public class L01_MyExp1 {
    static void main(String[] args) {
        System.out.println("Connection Established...");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your Age");
        int age = scan.nextInt();
        System.out.println("Age Entered is "+age);
        System.out.println("Connection terminated Gracefully");
    }
}
