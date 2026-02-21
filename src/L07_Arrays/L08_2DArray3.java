//in an apartment there are 3 floors . each floor has 4 houses . kindly help the milk man to drop the milk packets.
package L07_Arrays;

import java.util.Scanner;

public class L08_2DArray3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[][] apartment = new int[3][4];   // 3 floors, 4 houses each

        // storing milk packets for each house
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter milk packets for Floor " + i);

            for (int j = 0; j < 4; j++) {
                System.out.println("Enter milk packets for House [" + j + "]");
                apartment[i][j] = scan.nextInt();
            }
        }

        // displaying milk delivery details
        for (int i = 0; i < 3; i++) {
            System.out.println("\nMilk delivery for Floor " + i + ":");

            for (int j = 0; j < 4; j++) {
                System.out.println("House " + j + " gets " + apartment[i][j] + " packets");
            }
        }

        scan.close();
    }
}