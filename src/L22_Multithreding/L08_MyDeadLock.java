package L22_Multithreding;

class BPUT extends Thread {
    String cls1 = "javaclsroom";
    String cls2 = "awsclsroom";

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        if (name.equals("JAVATRAINER")) {
            javatrainerAcquired();
        } else {
            awstrainerAcquired();
        }
    }

    public void javatrainerAcquired() {
        synchronized (cls1) {
            try {
                System.out.println("Java trainer Acquired javaclass room");
                Thread.sleep(2000);
                synchronized (cls2) {
                    System.out.println("Java trainer Acquired awsclass room");
                    Thread.sleep(2000);
                }
            }
            catch (Exception e) {
                System.out.println("Some error occured");
            }
        }
    }

    public void awstrainerAcquired() {
        synchronized (cls2) {
            try {
                System.out.println("AWS trainer Acquired awsclass room");
                Thread.sleep(2000);
                synchronized (cls1) {
                    System.out.println("AWS trainer Acquired javaclass room");
                    Thread.sleep(2000);
                }
            }
            catch (Exception e) {
                System.out.println("Some error occured");
            }
        }
    }
}

public class L08_MyDeadLock {

    public static void main(String[] args) {

        BPUT b = new BPUT();
        Thread t1 = new Thread(b);
        Thread t2 = new Thread(b);
        t1.setName("JAVATRAINER");
        t2.setName("AWSTRAINER");
        t1.start();
        t2.start();

    }

}

/*class BPUT extends Thread {
    String res1 = "JAVACLsROOM";
    String res2 = "AWSCLsROOM";

    public void run() {
        String name = Thread.currentThread().getName();

        if (name.equals("JAVATRAINER")) {
            javaTrainerAcquired();
        } else {
            awsTrainerAcquired();
        }
    }

    void javaTrainerAcquired() {
        synchronized (res1) {
            try {
                System.out.println("Java trainer acquired JAVA clsroom");
                Thread.sleep(2000);

                synchronized (res2) {
                    System.out.println("Java trainer acquired AWS clsroom");
                    Thread.sleep(2000);
                }
            } catch (Exception e) {
                System.out.println("Java trainer failed");
            }
        }
    }

    void awsTrainerAcquired() {
        synchronized (res1) {
            try {
                System.out.println("Aws trainer acquired JAVA clsroom");
                Thread.sleep(2000);

                synchronized (res2) {
                    System.out.println("Aws trainer acquired AWS clsroom");
                    Thread.sleep(2000);
                }
            } catch (Exception e) {
                System.out.println("Aws trainer failed");
            }
        }
    }
}

public class MyDeadLock {
    public static void main(String[] args) {
        BPUT b = new BPUT();

        Thread t1 = new Thread(b);
        Thread t2 = new Thread(b);

        t1.setName("JAVATRAINER");
        t2.setName("AWSTRAINER");

        t1.start();
        t2.start();
    }
}*/
