package L23_MyException;

import java.util.Scanner;

public class L02_MyExp2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Connection Established");
        System.out.println("Enter int a");
        int a = sc.nextInt();
        System.out.println("Enter int b");
        int b = sc.nextInt();
        int c = a / b;
        System.out.println("Result of a/b is : "+c);
        System.out.println("Connection Terminated");
    }
}
