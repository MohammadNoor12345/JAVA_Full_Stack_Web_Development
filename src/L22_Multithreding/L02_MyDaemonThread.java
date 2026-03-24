package L22_Multithreding;

class AutoSave extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("AutoSave is running " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Typing extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            try {
                System.out.println("Typing... (Main Task) " + i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class AutoCompletion extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            try {
                System.out.println("AutoCompletion running " + i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class L02_MyDaemonThread {
    public static void main(String[] args) {

        Typing t1 = new Typing();           // Main thread (user typing)
        AutoSave t2 = new AutoSave();       // Support thread
        AutoCompletion t3 = new AutoCompletion(); // Support thread

        // Set daemon threads (must be before start)
        t2.setDaemon(true);
        t3.setDaemon(true);

        // Start threads
        t1.start();
        t2.start();
        t3.start();
    }
}
