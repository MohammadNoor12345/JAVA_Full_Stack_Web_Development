package L04_Pattern_in_JAVA;

public class L05_Pattern5 {
    public static void main(String[] args) {
        for (int r = 1; r <=5 ; r++) {
            for (int sp = 5; sp >= r ; sp--) {
                System.out.print("_");

            }
            for (int str = 1; str <= r ; str++) {
                System.out.print(" * ");

            }
            System.out.println();
        }
    }
}
