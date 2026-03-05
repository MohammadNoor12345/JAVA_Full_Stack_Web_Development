package L20_MyException;

import java.util.Scanner;

public class L01_MyExp1 {
    static void main(String[] args) {
        System.out.println("Connection Established...");
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Enter Your Age");
            int age = scan.nextInt();
            System.out.println("Age Entered is "+age);
        } catch (Exception e) {
            System.out.println("Age can't be string. Kindly provide integer");
        }
        System.out.println("Connection terminated Gracefully");
    }
}
