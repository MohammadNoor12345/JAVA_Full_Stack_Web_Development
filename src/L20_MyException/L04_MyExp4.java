package L20_MyException;

import java.util.Scanner;

public class L04_MyExp4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Connection Established");

        try {
            System.out.println("Enter the size of an array");

            int n = sc.nextInt();

            int[] arr = new int[n];

            System.out.println("Length of an array " + arr.length);
        }
        catch (Exception e) {
            System.out.println("Array size cannot be negative");
        }

        System.out.println("Connection Terminated");

        sc.close();
    }
}
// This is experiment 4