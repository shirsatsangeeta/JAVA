public class ProducerConsumer {

    private static final Object lock = new Object();

    private static int count = 0;

    public static void main(String[] args) {
        Thread producer = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    synchronized (lock) {
                        while (count == 10) {
                            try {
                                lock.wait();
                            } catch (InterruptedException e) {
                            }
                                e.printStackTrace();
                        }
                        count++;
                        System.out.println("Producer produced: " + count);
                        lock.notify();
                    }
                }
            }
        });

        Thread consumer = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    synchronized (lock) {
                        while (count == 0) {
                            try {
                                lock.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        count--;
                        System.out.println("Consumer consumed: " + count);
                        lock.notify();
                    }
                }
            }
        });

        producer.start();
        consumer.start();
    }
}