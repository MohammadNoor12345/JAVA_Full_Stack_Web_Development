package L23_ProducerConsumer_Problem;

// Shared Resource
class Queue {
    int x;
    boolean hasValue = false;

    public synchronized void store(int j) {
        try {
            while (hasValue) {
                wait(); // wait if full
            }

            x = j;
            System.out.println("Producer produced: " + x);

            hasValue = true;
            notify();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void retrieve() {
        try {
            while (!hasValue) {
                wait(); // wait if empty
            }

            System.out.println("Consumer consumed: " + x);

            hasValue = false;
            notify();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

// Producer Thread
class Producer extends Thread {
    Queue q;

    public Producer(Queue q) {
        this.q = q;
    }

    public void run() {
        int i = 0;
        while (true) {
            q.store(i++);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {}
        }
    }
}

// Consumer Thread
class Consumer extends Thread {
    Queue q;

    public Consumer(Queue q) {
        this.q = q;
    }

    public void run() {
        while (true) {
            q.retrieve();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
        }
    }
}

// Main Class
public class L01_ProducerConsumerDemo {
    public static void main(String[] args) {

        Queue q = new Queue();

        Producer producer = new Producer(q);
        Consumer consumer = new Consumer(q);

        producer.start();
        consumer.start();
    }
}