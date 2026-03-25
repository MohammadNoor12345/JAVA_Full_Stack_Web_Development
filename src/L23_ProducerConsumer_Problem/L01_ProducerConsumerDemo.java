package L23_ProducerConsumer_Problem;

// Queue Class
class Queue {
    int x;

    void store(int j) {
        x = j;
    }

    void retrieve() {
        System.out.println(x);
    }
}

// Producer Class
class Producer extends Thread {
    Queue q;

    public Producer(Queue k) {
        q = k;
    }

    public void run() {
        int i = 0;
        for (;;) {
            q.store(i++);
        }
    }
}

// Consumer Class
class Consumer extends Thread {
    Queue b;

    public Consumer(Queue q) {
        b = q;
    }

    public void run() {
        for (;;) {
            b.retrieve();
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