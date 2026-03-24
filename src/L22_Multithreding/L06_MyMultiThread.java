package L22_Multithreding;

class Mythread1 extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(2000);
                System.out.println("2 x " + i + " = " + (2 * i));
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

class Mythread2 extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(2000);
                System.out.println("3 x " + i + " = " + (3 * i));
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

    }
}

class Mythread3 extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(2000);
                System.out.println("4 x " + i + " = " + (4 * i));
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

    }
}

public class L06_MyMultiThread {

    public static void main(String[] args) {

        System.out.println("Main thread started");
        Mythread1 t1 = new Mythread1();
        Mythread2 t2 = new Mythread2();
        Mythread3 t3 = new Mythread3();
        try {

            t3.start();
            t3.join();

            t2.start();
            t2.join();

            t1.start();
            t1.join();

            System.out.println("Main thread completed");
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
