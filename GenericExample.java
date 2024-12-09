// A generic class named Number_1
class Number_1<T> {
    // A variable to hold the value
    private T value;

    // Constructor to initialize the value
    public Number_1(T value) {
        this.value = value;
    }

    // Method to get the value
    public T getValue() {
        return value;
    }

    // Method to display the value
    public void displayValue() {
        System.out.println("The value is: " + value);
    }
}

// Main class to test the Number_1 class
public class GenericExample {
    public static void main(String[] args) {
        // Create a Number_1 object for Integer
        Number_1<Integer> intNumber = new Number_1<>(100);
        intNumber.displayValue();

        // Create a Number_1 object for Float
        Number_1<Float> floatNumber = new Number_1<>(10.5f);
        floatNumber.displayValue();
    }
}
