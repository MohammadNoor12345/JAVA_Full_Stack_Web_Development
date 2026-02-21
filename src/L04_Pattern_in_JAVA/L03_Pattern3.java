package L04_Pattern_in_JAVA;

public class L03_Pattern3 {
        public static void main(String[] args) {

            for (int r = 1; r <= 5; r++) {      // rows decrease
                for (int s = 5; s >= r; s--) {  // stars depend on row
                    System.out.print("* ");
                }
                System.out.println();           // next line
            }
        }
    }


