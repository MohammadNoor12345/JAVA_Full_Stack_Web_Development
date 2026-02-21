package L08_User_input;

import java.util.Scanner;

public class L01_My_Input {

    String name;
    int age;
    boolean status;
    double salary;

    public static void main(String[] args) {
        L01_My_Input i = new L01_My_Input();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name");
        i.name = scan.next();
        System.out.println(i.name);
        System.out.println("Enter your age");
        i.age = scan.nextInt();
        System.out.println("Enter your status");
        i.status = scan.nextBoolean();
        System.out.println("Enter Your salary");
        i.salary = scan.nextDouble();

    }
}
