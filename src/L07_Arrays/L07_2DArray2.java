package L07_Arrays;

import java.util.Scanner;

public class L07_2DArray2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[][] building = new int[3][3];   // 3 floors, 3 rooms each

        // storing number of persons in each room
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for Floor " + i);

            for (int j = 0; j < 3; j++) {
                System.out.println("Enter number of persons in Room [" + j + "]");
                building[i][j] = scan.nextInt();
            }
        }

        // displaying data
        for (int i = 0; i < 3; i++) {
            System.out.println("\nFloor " + i + " details:");

            for (int j = 0; j < 3; j++) {
                System.out.println("Number of persons in Room " + j + " = " + building[i][j]);
            }
        }

        scan.close();
    }
}
//in an apartment there are 3 floors . each floor has 4 houses . kindly help the milk man to drop the milk packets.