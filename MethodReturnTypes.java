public class MethodReturnTypes {
    // Main method
    public static void main(String[] args) {
        // Call displayWelcomeMessage
        displayWelcomeMessage();

        // Declare variables and call calculateAverage
        int value1 = 20;
        int value2 = 30;
        double result = calculateAverage(value1, value2);

        // Print the result
        System.out.println("The average is: " + result);
    }

    // displayWelcomeMessage method
    public static void displayWelcomeMessage() {
        System.out.println("Welcome to our program!");
    }

    // calculateAverage method
    public static double calculateAverage(int num1, int num2) {
        double average = (num1 + num2) / 2.0;
        return average;
    }
}
