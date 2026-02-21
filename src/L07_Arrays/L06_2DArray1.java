package L07_Arrays;

import java.util.Scanner;

public class L06_2DArray1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[][] marks = new int[2][4];   // 2 classrooms (rows), 4 students(column) each

        // storing marks
        for (int i = 0; i < 2; i++) {
            System.out.println("Enter marks for Classroom " + i);

            for (int j = 0; j < 4; j++) {
                System.out.println("Enter marks of student [" + j + "]");
                marks[i][j] = scan.nextInt();
            }
        }

        // displaying marks
        for (int i = 0; i < 2; i++) {
            System.out.println("\nClassroom " + i + " marks:");

            for (int j = 0; j < 4; j++) {
                System.out.println("Student " + j + " marks = " + marks[i][j]);
            }
        }

        scan.close();
    }
}
