public class Counter {
    // Static variable to keep track of the count
    static int count = 0;

    // Instance variable to store the current count for an object
    int objectCount;

    // Constructor to initialize the object count and update the static count
    public Counter() {
        objectCount = ++count;
    }

    // Method to display the current count for an object
    public void displayCount() {
        System.out.println("Object " + objectCount + ": Current Count - " + count);
    }

    public static void main(String[] args) {
        // Create multiple objects of the Counter class
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();
        Counter counter3 = new Counter();

        // Display the current count for each object
        counter1.displayCount();
        counter2.displayCount();
        counter3.displayCount();
    }
}
