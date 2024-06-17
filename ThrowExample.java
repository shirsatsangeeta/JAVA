public class ThrowExample {
    static void checkEligibilty(int stuage, int stuweight) {
        if (stuage < 12 && stuweight < 40) {
            throw new ArithmeticException("Student is not eligible for registration");
        } else {
            System.out.println("Student Entry is Valid!!");
        }
    }

    public static void main(String args[]) {
        System.out.println("Welcome to the Registration process!!");
        try {
            checkEligibilty(10, 35);
            System.out.println("Student is eligible for registration.");
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }
        System.out.println("Have a nice day..");
    }
}
