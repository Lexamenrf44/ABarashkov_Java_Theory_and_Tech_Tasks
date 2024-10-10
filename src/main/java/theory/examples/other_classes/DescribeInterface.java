package main.java.theory.examples.other_classes;

/*

Interface

Defines a contract that other classes or interfaces must follow.
It contains abstract methods (without implementation) that implementing classes must override.
Used to define behaviors (methods) that multiple classes can implement.

*/

// Define an interface named Vehicle
interface Vehicle {
    // Abstract method, must be implemented by any class that implements this interface
    void start();  // Method to start the vehicle

    // Abstract method, must be implemented by the implementing class
    void stop();   // Method to stop the vehicle
}

// Create a class named Car that implements the Vehicle interface
class Car implements Vehicle {
    private String name;  // Field to store the name of the car

    // Constructor to initialize the car name
    public Car(String name) {
        this.name = name;  // Assign the name to the field
    }

    // Override the start method from the Vehicle interface
    @Override
    public void start() {
        System.out.println(name + " is starting.");
    }

    // Override the stop method from the Vehicle interface
    @Override
    public void stop() {
        System.out.println(name + " is stopping.");
    }
}

// Main class to demonstrate interface usage
public class DescribeInterface {
    public static void main(String[] args) {
        // Create an instance of the Car class with name "Tesla"
        Vehicle car = new Car("Tesla");

        // Call the start method (inherited from Vehicle) on the car instance
        car.start();  // Output: Tesla is starting.

        // Call the stop method (inherited from Vehicle) on the car instance
        car.stop();  // Output: Tesla is stopping.
    }
}

