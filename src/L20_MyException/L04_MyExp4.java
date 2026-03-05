package L20_MyException;

import java.util.Scanner;

public class L04_MyExp4 {
    public static void main(String[] args) {
        // Input Mismatch Exception

        Scanner sc = new Scanner(System.in);

        System.out.println("Connection Established");
        System.out.println("Enter the size of an array");

        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Length of an array " + arr.length);

        System.out.println("Connection Terminated");

        sc.close();
    }
}