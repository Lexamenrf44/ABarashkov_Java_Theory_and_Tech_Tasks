package main.java.theory.examples.encapsulation;

public class EncapsulationPersonClassUsage {
    public static void main(String[] args) {
        // Create a Person object using the constructor
        EncapsulationPersonPublicClass person = new EncapsulationPersonPublicClass("John", 25);

        // Access the private field 'name' using the public getter method
        System.out.println(person.getName());  // Output: John

        // Modify the 'name' field using the public setter method
        person.setName("Jane");
        System.out.println(person.getName());  // Output: Jane

        // Access the private field 'age' using the public getter method
        System.out.println(person.getAge());   // Output: 25

        // Modify the 'age' field using the public setter method
        person.setAge(30);
        System.out.println(person.getAge());   // Output: 30

        // Try setting an invalid age
        person.setAge(-5);
        System.out.println(person.getAge());   // Output: 30 (The age does not change)
    }
}

