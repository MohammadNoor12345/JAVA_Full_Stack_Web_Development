// a painter wants to paint the rooms in a single floor kindly help him to complete his task by taking input from the end user.
package L07_Arrays;

import java.util.Scanner;

public class L03_Array3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number of rooms in the floor:");
        int n = scan.nextInt();

        int[] rooms = new int[n];
        int totalArea = 0;

        // storing room areas
        for (int i = 0; i < n; i++) {
            System.out.println("Enter area of room [" + i + "] to paint:");
            rooms[i] = scan.nextInt();
        }

        // displaying and calculating total work
        for (int i = 0; i < n; i++) {
            System.out.println("Area of room " + i + " is " + rooms[i]);
            totalArea = totalArea + rooms[i];
        }

        // Total area to paint by painter
        System.out.println("Total area to paint = " + totalArea);

        scan.close();
    }
    }

