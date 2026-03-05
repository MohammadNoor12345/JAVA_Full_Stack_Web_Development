package L20_MyException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class L05_MyGeneric {

    public static void main(String[] args) {

        int[] arr = null;

        System.out.println("connection established");

        Scanner sc = new Scanner(System.in);

        try {

            System.out.println("Enter ur age");
            int age = sc.nextInt();
            System.out.println("Age entered is " + age);

            System.out.println("Enter int a");
            int a = sc.nextInt();

            System.out.println("Enter int b");
            int b = sc.nextInt();

            int c = a / b;
            System.out.println("Result of a/b is: " + c);

            arr = new int[3];
            arr[0] = 10;
            arr[1] = 20;
            arr[2] = 30;

            System.out.println("Enter the index u need to access:");
            int index = sc.nextInt();
            System.out.println(arr[index]);

            System.out.println("Enter the size of an array:");
            int n = sc.nextInt();

            int[] a1 = new int[n];
            System.out.println("Length of an array " + a1.length);

        }

        catch (InputMismatchException e) {
            System.out.println("Age can not be string");
        }

        catch (ArithmeticException e) {
            System.out.println("Denominator cant be 0");
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Try to access within " + arr.length);
        }

        catch (NegativeArraySizeException e) {
            System.out.println("Kindly provide array size to positive integer");
        }

        catch (Exception e) {
            System.out.println("Kindly provide the right inputs");
        }

        System.out.println("Connection terminated gracefully");

        sc.close();
    }
}