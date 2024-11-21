package helpers;

public class OverrideMethod {

    // Base class Animal
    public static class Animal {

        // Method in the base class
        public void makeSound() {
            // Prints the generic animal sound
            System.out.println("Animal makes a sound");
        }
    }

    // Derived class Dog that inherits from Animal
    public static class Dog extends Animal {

        // Overridden method makeSound() in the derived class
        @Override
        public void makeSound() {
            // Prints the sound specific to a dog
            System.out.println("Dog barks: Woof Woof");
        }
    }

    // Derived class Cat that inherits from Animal
    public static class Cat extends Animal {

        // Overridden method makeSound() in the derived class
        @Override
        public void makeSound() {
            // Prints the sound specific to a cat
            System.out.println("Cat meows: Meow Meow");
        }
    }
}
