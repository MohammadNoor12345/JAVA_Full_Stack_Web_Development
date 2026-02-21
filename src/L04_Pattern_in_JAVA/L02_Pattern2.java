package L04_Pattern_in_JAVA;

public class L02_Pattern2 {
    public static void main(String[] args) {

        for (int r = 1; r <= 5; r++) {
            for (int s = 1; s <= r; s++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
