package tech_tasks;

public class HumanCompare {
    public static void main(String[] args) {

        Human human1 = new Human("Alice", 25);
        Human human2 = new Human("Bob", 30);

        int comparisonResult = human1.compareTo(human2);

        if (comparisonResult < 0) {
            System.out.println(human1.getName() + " is younger than " + human2.getName());
        } else if (comparisonResult > 0) {
            System.out.println(human1.getName() + " is older than " + human2.getName());
        } else {
            System.out.println(human1.getName() + " and " + human2.getName() + " are the same age.");
        }
    }
}
