import java.util.Scanner;
public class AuthenticationExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String correctPassword = "vinay0110";
        System.out.print("Enter your password: ");
        String enteredPassword = scanner.nextLine();
        try {
            authenticate(enteredPassword, correctPassword);
            System.out.println("Authentication successful!");
        } catch (AuthenticationException e) {
            System.out.println("Authentication Failure: " + e.getMessage());
        }
    }
    public static void authenticate(String enteredPassword, String correctPassword) throws AuthenticationException {
        if (!enteredPassword.equals(correctPassword)) {
            throw new AuthenticationException("Incorrect password");
        }
    }
}
class AuthenticationException extends Exception {
    public AuthenticationException(String message) {
        super(message);
    }
}
