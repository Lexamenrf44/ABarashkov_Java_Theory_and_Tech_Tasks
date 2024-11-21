package theory.examples;

import helpers.OverrideMethod;

public class OverrideTaskViaMethodCall {
    public static void main(String[] args) {

        // Create an Animal object and call makeSound()
        OverrideMethod.Animal genericAnimal = new OverrideMethod.Animal();
        genericAnimal.makeSound();  // Expected output: "Animal makes a sound"

        // Create a Dog object and call makeSound()
        OverrideMethod.Dog dog = new OverrideMethod.Dog();
        dog.makeSound();  // Expected output: "Dog barks: Woof Woof"

        // Create a Cat object and call makeSound()
        OverrideMethod.Cat cat = new OverrideMethod.Cat();
        cat.makeSound();  // Expected output: "Cat meows: Meow Meow"
    }
}
