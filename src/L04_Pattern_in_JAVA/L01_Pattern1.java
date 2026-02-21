package L04_Pattern_in_JAVA;

public class L01_Pattern1 {
    public static void main(String[] args) {
        for (int r = 1; r <= 5; r++) { // for no of rows
            for (int s = 1; s <= 5; s++) {// for stars (*)
                System.out.print("* ");
            }
            for (int d = 1; d <= 5 ; d++) { // for dollar ($)
                System.out.print("$ ");
            }
            System.out.println();
        }
    }
}
