package L07_Arrays;

import java.util.Scanner;

public class L02_Array2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] a = new int [5];
        // this is for storing the data
        for (int i = 0; i <= 4 ; i++) {
            System.out.println("Enter data for a [" +i+ "]");
            a[i] = scan.nextInt();

        }
        for (int i = 0; i <=4 ; i++) {
            System.out.println("Data for "+ i + " is " + a[i]);

        }

    }

}
// i <=4 or write i < a.length
// both are same thing