package L23_ProducerConsumer_Problem;

// Shared Resource
class Queue {
    int x;

    void store(int j) {
        x = j;
        System.out.println("Produced: " + x);
    }

    void retrieve() {
        System.out.println("Consumed: " + x);
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
        }
    }
}

// Main Class
public class L01_ProducerConsumerDemo {
    public static void main(String[] args) {

        Queue q = new Queue();

        Producer p = new Producer(q);
        Consumer c = new Consumer(q);

        p.start();
        c.start();
    }
}