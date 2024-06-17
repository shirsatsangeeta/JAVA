import java.lang.ArithmeticException;

public class throws_Example1 {
    int division(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        int t = a / b;
        return t;
    }

    public static void main(String args[]) {
        throws_Example1 obj = new throws_Example1();
        try {
            System.out.println(obj.division(15, 0));
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }
    }
}
