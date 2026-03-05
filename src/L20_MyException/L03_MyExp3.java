package L20_MyException;

import java.util.Scanner;

public class L03_MyExp3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Connection Established");

        int[] arr = new int[3];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;

        System.out.println("Enter the index you need to access : ");
        int index = sc.nextInt();

        System.out.println(arr[index]);

        System.out.println("Connection Terminated");
    }
}