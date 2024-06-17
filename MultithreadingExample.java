class Worker extends Thread {
    private String name;
    private int documentsToPrint;

    public Worker(String name, int documentsToPrint) {
        this.name = name;
        this.documentsToPrint = documentsToPrint;
    }

    @Override
    public void run() {
        System.out.println(name + " started printing.");
        for (int i = 1; i <= documentsToPrint; i++) {
            System.out.println(name + " is printing document " + i);
            try {
                // Simulate printing time
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(name + " finished printing.");
    }
}

public class MultithreadingExample {
    public static void main(String[] args) {
        // Create and start 3 workers
        Worker worker1 = new Worker("Printer 1", 5);
        Worker worker2 = new Worker("Printer 2", 3);
        Worker worker3 = new Worker("Printer 3", 4);

        worker1.start();
        worker2.start();
        worker3.start();
    }
}
