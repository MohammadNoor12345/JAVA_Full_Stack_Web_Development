package L25_Methods_in_Java;

import java.util.Scanner;

public class L03_MyIndexOf {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        System.out.print("Enter character to find: ");
        char ch = sc.next().charAt(0);

        int index = s.indexOf(ch);

        if (index != -1) {
            System.out.println("Character found at index: " + index);
        } else {
            System.out.println("Character not found");
        }

        sc.close();
    }
}
