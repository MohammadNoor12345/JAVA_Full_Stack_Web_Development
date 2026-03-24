package L22_Multithreding;
class MyDemo extends Thread{

    @Override
    public void run() {

        for(;;) {
            try {
                System.out.println("User Thread");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

    }

}

public class L01_MyUser {

    public static void main(String[] args) {
        System.out.println("Main thread started");
        MyDemo u1 = new MyDemo();
        u1.start();
        System.out.println("Main thread ended");

    }

}
