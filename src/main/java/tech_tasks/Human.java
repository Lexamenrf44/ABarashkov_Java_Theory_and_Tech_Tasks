package tech_tasks;

public class Human implements Comparable<Human> {
    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Human other) {
        return Integer.compare(this.age, other.age);
    }

    @Override
    public String toString() {
        return "Human{name='" + name + "', age=" + age + "}";
    }
}
