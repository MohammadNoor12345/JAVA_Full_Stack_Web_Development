package L07_Arrays;

import java.util.Scanner;

public class L09_JaggedArray1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[][] a = new int[2][];  // jagged array (columns not fixed)

        a[0] = new int[2];   // row 0 → 2 elements
        a[1] = new int[3];   // row 1 → 3 elements

        // storing data
        for (int r = 0; r < a.length; r++) {
            System.out.println("Enter data for row " + r);

            for (int c = 0; c < a[r].length; c++) {
                System.out.println("Enter element [" + r + "][" + c + "]");
                a[r][c] = scan.nextInt();
            }
        }

        // displaying data
        System.out.println("\nStored Data:");
        for (int r = 0; r < a.length; r++) {
            for (int c = 0; c < a[r].length; c++) {
                System.out.print(a[r][c] + " ");
            }
            System.out.println();
        }

        scan.close();
    }
}
