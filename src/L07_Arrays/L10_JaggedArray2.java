// in a school there are 3 classrooms. 1st classroom has 4 students, 2nd classroom has 2 students, 3rd classroom has 3 students
package L07_Arrays;

public class L10_JaggedArray2 {

        public static void main(String[] args) {

            //(different size classrooms)
            int[][] classroom = new int[3][];

            // assign students to each classroom
            classroom[0] = new int[4];  // 1st classroom → 4 students
            classroom[1] = new int[2];  // 2nd classroom → 2 students
            classroom[2] = new int[3];  // 3rd classroom → 3 students

            // display number of students in each classroom
            for (int i = 0; i < classroom.length; i++) {
                System.out.println("Classroom " + (i + 1) + " has " + classroom[i].length + " students");
            }
        }
    }


