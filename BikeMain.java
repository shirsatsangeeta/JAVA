	class Vehicle {
    void run() {
        System.out.println("Vehicle is running");
    }
}

class BikeMain extends Vehicle {
    // Specific implementation of the run method
    void run() {
        System.out.println("Bike is running safely");
        super.run(); // Calls the overridden method in Vehicle class
    }

    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.run();
    }
}
