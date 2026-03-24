package L22_Multithreding;


class MyBeta extends Thread{

    @Override
    public void run() {
        try {
            System.out.println("Line 1");
            Thread.sleep(1000);
            System.out.println("Line 2");
            Thread.sleep(1000);
            System.out.println("Line 3");
            Thread.sleep(1000);
            System.out.println("Line 4");
            Thread.sleep(1000);
            System.out.println("Line 5");
            Thread.currentThread().interrupt();
            Thread.sleep(1000);
            System.out.println("Line 6");
            Thread.sleep(1000);
            System.out.println("Line 7");
            Thread.sleep(1000);
            System.out.println("Line 8");
            Thread.sleep(1000);
            System.out.println("Line 9");
            Thread.sleep(1000);
            System.out.println("Line 10");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            System.out.println("Thread got Interrupted");
//				e.printStackTrace();
        }
    }

}

public class L07_MyInterrupt {

    public static void main(String[] args) {
        System.out.println("Main started");
        MyBeta b1 = new MyBeta();
        b1.start();
        System.out.println("Main completed");


    }

}


