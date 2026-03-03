package L19_MyInterface;

import java.util.Scanner;

interface Calculator {

    void add(int a, int b);
    void sub(int a, int b);
}

class Calc1 implements Calculator {

    public void add(int a, int b) {
        System.out.println("a+b = " + (a + b));
    }

    public void sub(int a, int b) {
        System.out.println("a-b = " + (a - b));
    }
}

class SciCalc implements Calculator {

    public void add(int a, int b) {
        System.out.println("Sum = " + (a + b));
    }

    public void sub(int a, int b) {
        System.out.println("Difference = " + (a - b));
    }
}

class MathCalc implements Calculator {

    public void add(int a, int b) {
        System.out.println("Addition = " + (a + b));
    }

    public void sub(int a, int b) {
        System.out.println("Subtraction = " + (a - b));
    }
}

public class L01_MyOpr {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        Calculator c1 = new Calc1();
        Calculator c2 = new SciCalc();
        Calculator c3 = new MathCalc();

        System.out.println("\nCalc1 Output:");
        c1.add(num1, num2);
        c1.sub(num1, num2);

        System.out.println("\nSciCalc Output:");
        c2.add(num1, num2);
        c2.sub(num1, num2);

        System.out.println("\nMathCalc Output:");
        c3.add(num1, num2);
        c3.sub(num1, num2);

        sc.close();
    }
}