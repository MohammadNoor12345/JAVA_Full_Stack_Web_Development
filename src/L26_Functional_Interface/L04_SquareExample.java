package L26_Functional_Interface;

import java.util.Scanner;

@FunctionalInterface
interface Square {
    int sqr(int x);
}

public class L04_SquareExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        Square s = (x) -> x * x;

        int result = s.sqr(num);

        System.out.println("Square is: " + result);
    }
}
