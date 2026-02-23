package L07_Arrays;

import java.util.Scanner;

public class L09_3DArray1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // 3D array → [building][floor][cabin]
        int[][][] a = new int[2][3][4];

        // taking input
        for (int b = 0; b < 2; b++) {
            for (int r = 0; r < 3; r++) {
                for (int c = 0; c < 4; c++) {
                    System.out.print("Enter data for a[" + b + "][" + r + "][" + c + "] : ");
                    a[b][r][c] = scan.nextInt();
                }
            }
        }

        // displaying data
        System.out.println("\nStored Data:");

        for (int b = 0; b < 2; b++) {
            System.out.println("Building " + (b + 1));

            for (int r = 0; r < 3; r++) {
                System.out.print("Floor " + (r + 1) + " → ");

                for (int c = 0; c < 4; c++) {
                    System.out.print(a[b][r][c] + " ");
                }
                System.out.println();
            }
        }

        scan.close();
    }
}