package L27_MyPredicate;

import java.util.function.Predicate;

public class L01_MyPredicate {
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 10, 15, 20, 25, 27, 28, 30, 36};

        Predicate<Integer> p = num -> num % 2 == 0;

        for (int n : a) {
            if (p.test(n)) {
                System.out.println("Even number: " + n);
            }
        }
    }
}