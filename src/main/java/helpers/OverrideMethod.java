package helpers;

public class OverrideMethod {

    public static class Animal {
        public void makeSound() {
            System.out.println("Animal makes a sound");
        }
    }

    public static class Dog extends Animal {

        @Override
        public void makeSound() {
            System.out.println("Dog barks: Woof Woof");
        }
    }

    public static class Cat extends Animal {

        @Override
        public void makeSound() {
            System.out.println("Cat meows: Meow Meow");
        }
    }
}
