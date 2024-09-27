class SharedData {
    private int data;
    boolean dataProduced = false; // Initially no data is produced

    // Producer method
    public synchronized void Produce(int d) {
        // If data is already produced, the producer waits
        while (dataProduced) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        this.data = d;
        System.out.println("Produced: " + d);
        dataProduced = true; // Mark data as produced
        notify(); // Notify the consumer that data is ready
    }

    // Consumer method
    public synchronized int Consume() {
        // If data is not yet produced, the consumer waits
        while (!dataProduced) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println("Consumed: " + data);
        dataProduced = false; // Mark data as consumed
        notify(); // Notify the producer to produce more data
        return data;
    }
}

class Producer extends Thread {
    SharedData d;

    public Producer(SharedData d) {
        this.d = d;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            d.Produce(i); // Produce numbers from 1 to 5
            try {
                Thread.sleep(1000); // Simulate time taken to produce
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer extends Thread {
    SharedData d;

    public Consumer(SharedData d) {
        this.d = d;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            d.Consume(); // Consume data produced by the producer
            try {
                Thread.sleep(1500); // Simulate time taken to consume
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ProducerConsumer {
    public static void main(String[] args) {
        SharedData data = new SharedData();
        Producer p = new Producer(data);
        Consumer c = new Consumer(data);
        p.start(); // Start the producer thread
        c.start(); // Start the consumer thread
    }
}
