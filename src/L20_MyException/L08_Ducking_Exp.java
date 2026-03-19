package L20_MyException;

import java.util.Scanner;

class Demo5{

    public void m5 () throws ArithmeticException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Connection2 established");
        System.out.println("Enter num a");
        int a=scan.nextInt();
        System.out.println("Enter num b");
        int b = scan.nextInt();
        int c=a/b;
        System.out.println(c);
        System.out.println("Connection2 terminated");
        scan.close();
    }

}
class Demo4{

    public void m4() throws ArithmeticException {

        Demo5 d5 = new Demo5();
//		try {
        d5.m5();
//		}
		/*catch (Exception e) {
			System.out.println("Exception handled in m4()");
		}*/

    }

}

public class L08_Ducking_Exp {

    public static void main(String[] args) {

        Demo4 d4 = new Demo4();
        try {
            d4.m4();
        }
        catch (Exception e) {
            System.out.println("Exception handled in main()");
        }

    }

}