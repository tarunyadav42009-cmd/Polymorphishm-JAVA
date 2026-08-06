/**
 * Demonstrates compile-time polymorphism through method overloading.
 */
public class overload {

    /**
     * Prints a default message when no arguments are provided.
     */
    public void put() {
        System.out.println("No parameters provided.");
    }

    /**
     * Prints a message displaying the single integer argument.
     * 
     * @param x The first integer value
     */
    public void put(int x) {
        System.out.printf("One parameter provided: %d%n", x);
    }

    /**
     * Prints a message displaying both integer arguments.
     * 
     * @param x The first integer value
     * @param y The second integer value
     */
    public void put(int x, int y) {
        System.out.printf("Two parameters provided: %d and %d%n", x, y);
    }

    /**
     * Application entry point.
     */
    public static void main(String[] args) {
        overload overloadedObject = new overload();
        
        // Triggers the no-argument method
        overloadedObject.put(); 
        
        // Triggers the single-argument method
        overloadedObject.put(123); 
        
        // Triggers the two-argument method
        overloadedObject.put(12, 123); 
    }
}
