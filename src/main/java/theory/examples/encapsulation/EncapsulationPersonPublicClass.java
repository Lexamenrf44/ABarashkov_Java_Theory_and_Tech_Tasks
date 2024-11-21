package theory.examples.encapsulation;

// 1. Define the class `Person`
public class EncapsulationPersonPublicClass {

    // 2. Declare a private field 'name' (Encapsulation: the data is hidden)
    private String name;

    // 3. Declare a private field 'age' (Encapsulation: the data is hidden)
    private int age;

    // 4. Constructor to initialize the Person object
    public EncapsulationPersonPublicClass(String name, int age) {

        // 5. Set the value of the 'name' attribute
        this.name = name;

        // 6. Set the value of the 'age' attribute
        this.age = age;
    }

    // 7. Public method to get the value of 'name' (Getter method)
    public String getName() {
        return name; // 8. Return the value of the private field 'name'
    }

    // 9. Public method to set a new value for 'name' (Setter method)
    public void setName(String name) {
        // 10. Assign the new value to the private field 'name'
        this.name = name;
    }

    // 11. Public method to get the value of 'age' (Getter method)
    public int getAge() {
        return age; // 12. Return the value of the private field 'age'
    }

    // 13. Public method to set a new value for 'age' (Setter method)
    public void setAge(int age) {
        // 14. Ensure the age is valid before setting it
        if(age > 0) {
            this.age = age;
        }
    }
}
