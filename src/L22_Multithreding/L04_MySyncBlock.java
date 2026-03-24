package L22_Multithreding;


class MySyncThread implements Runnable
{
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        try {
            System.out.println(name+" accessing the Line 1");
            Thread.sleep(2000);
            System.out.println(name+" accessing the Line 2");
            Thread.sleep(2000);
            System.out.println(name+" accessing the Line 3");
            Thread.sleep(2000);
            System.out.println(name+" accessing the Line 4");
            Thread.sleep(2000);
            synchronized(this){
                System.out.println(name+" accessing the Line 5");
                Thread.sleep(2000);
                System.out.println(name+" accessing the Line 6");
                Thread.sleep(2000);
                System.out.println(name+" accessing the Line 7");
                Thread.sleep(2000);
                System.out.println(name+" accessing the Line 8");
            }
            Thread.sleep(2000);
            System.out.println(name+" accessing the Line 9");
            Thread.sleep(2000);
            System.out.println(name+" accessing the Line 10");
        }
        catch (InterruptedException e) {
            System.out.println("some exception i m not worried");
        }

    }
}

public class L04_MySyncBlock {

    public static void main(String[] args) {
        MySyncThread syn = new MySyncThread();

        Thread t1 = new Thread(syn);
        Thread t2 = new Thread(syn);
        Thread t3 = new Thread(syn);
        t1.setName("JAVA");
        t2.setName("AWS");
        t3.setName("CYBER");
        t1.start();
        t2.start();
        t3.start();


    }

}
