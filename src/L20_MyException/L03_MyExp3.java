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

        try {
            System.out.println("Enter the index you need to access : ");
            int index = sc.nextInt();

            System.out.println(arr[index]);
        }
        catch (Exception e) {
            System.out.println("Invalid index. Kindly enter index between 0 to 2");
        }

        System.out.println("Connection Terminated");
    }
}
// This is experiment 3