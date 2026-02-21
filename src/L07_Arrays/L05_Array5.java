// employer wants to store employees salary . kindly help him in doing so. use float here
package L07_Arrays;

import java.util.Scanner;

public class L05_Array5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double[] salary = new double[5];   // array to store salaries

        // storing employee salaries
        for (int i = 0; i <= 4; i++) {
            System.out.println("Enter salary of employee [" + i + "]");
            salary[i] = scan.nextDouble();
        }

        // displaying employee salaries
        for (int i = 0; i <= 4; i++) {
            System.out.println("Salary of employee " + i + " is " + salary[i]);
        }

        scan.close();
    }
}
// in a school there are 2 classrooms . each classroom has 4 students. help the teacher to assign the mark for each student.