// Encapsulated class
class Person {
    // Private variables
    private String name;
    private int age;

    // Public getter method for name
    public String getName() {
        return name;
    }

    // Public setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Public getter method for age
    public int getAge() {
        return age;
    }

    // Public setter method for age
    public void setAge(int age) {
        // Validation can be added here
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age cannot be negative or zero.");
        }
    }
}

// Main class to test encapsulation
public class TestEncapsulation {
    public static void main(String[] args) {
        // Creating an object of the Person class
        Person person = new Person();

        // Setting values using setter methods
        person.setName("Shweta Sony");
        person.setAge(24);

        // Getting values using getter methods
        System.out.println("Person's Name: " + person.getName());
        System.out.println("Person's Age: " + person.getAge());
    }
}

 // Output :- Person's Name: Shweta Sony
  //                 Person's Age: 24