// a teacher of a class want to store names of a students. Kindly take the input and help her to achieve
package L07_Arrays;

import java.util.Scanner;

public class L04_Array4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] students = new String[5];

        // store student names
        for (int i = 0; i <= 4; i++) {
            System.out.println("Enter name of student [" + i + "]");
            students[i] = scan.nextLine();
        }

        // display student names
        for (int i = 0; i <= 4; i++) {
            System.out.println("Student " + i + " is " + students[i]);
        }

        scan.close();
    }
}
