public class EvenOddThreadExample {

    public static void main(String[] args) {
        // Creating instances of threads
        Thread evenThread = new Thread(new EvenRunnable());
        Thread oddThread = new Thread(new OddRunnable());

        // Starting threads
        evenThread.start();
        oddThread.start();
    }

    // Runnable implementation for even numbers
    static class EvenRunnable implements Runnable {
        @Override
        public void run() {
            for (int i = 2; i <= 50; i += 2) {
                System.out.println("Even: " + i);
                if (i % 6 == 0) { // Check for every 3rd iteration
                    try {
                        Thread.sleep(50); // Sleep for 50 milliseconds
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    // Runnable implementation for odd numbers
    static class OddRunnable implements Runnable {
        @Override
        public void run() {
            for (int i = 1; i <= 50; i += 2) {
                System.out.println("Odd: " + i);
            }
        }
    }
}