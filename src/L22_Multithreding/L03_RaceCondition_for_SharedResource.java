package L22_Multithreding;

class WhiteBoard implements Runnable {
    synchronized public void run() {
        String name = Thread.currentThread().getName();
        try {
            System.out.println(name + " trying to access white board");
            Thread.sleep(1000);

            System.out.println(name + " got access to white board");

            for (int i = 1; i <= 10; i++) {
                System.out.println(name + " writing on the board");
                Thread.sleep(2000);
            }

            System.out.println(name + " done accessing white board");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class L03_RaceCondition_for_SharedResource {
    public static void main(String[] args) {

        WhiteBoard w = new WhiteBoard(); // ONE shared resource

        Thread t1 = new Thread(w);
        Thread t2 = new Thread(w);
        Thread t3 = new Thread(w);

        t1.setName("JAVA");
        t2.setName("AWS");
        t3.setName("CYBER");

        t1.start();
        t2.start();
        t3.start();
    }
}