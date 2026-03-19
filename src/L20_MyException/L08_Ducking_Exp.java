package L20_MyException;

import java.util.Scanner;

class Demo5{
    public void m5(){
        Scanner sc = new Scanner(System.in);
        System.out.println("connection2 established");
        System.out.println("Enter int a");
        int a = sc.nextInt();

        System.out.println("Enter int b");
        int b = sc.nextInt();

        int c = a / b;
        System.out.println("Result of a/b is: " + c);
        System.out.println("Connection2 terminated");
    }
}

public class L08_Ducking_Exp {
    static void main(String[] args) {

    }
}
