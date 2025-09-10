import com.Prudhvi.DayTwo;
public class Main {
    public static void main(String[] args) {
        DayTwo obj = new DayTwo();
        obj.message();

        // Create an object of the Person class
        Person details = new Person();
        Person details1 = new Person();

        // Set values for the attributes using the object
        details.name = "kunal";
        details.age = 20;

        details1.name = "kunal";
        details1.age = 20;

        // Display the details
        System.out.println(details1.equals(details));

    }
}

class Person {
    String name;
    int age;
}
