public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            // Code that may throw an exception
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Catch block to handle specific exceptions
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            // Finally block always executes whether exception occurs or not
            System.out.println("Finally block executed.");
        }
    }

    public static int divide(int num1, int num2) {
        // Method that may throw an exception
        return num1 / num2;
    }
}
