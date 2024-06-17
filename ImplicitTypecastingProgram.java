public class ImplicitTypecastingProgram {
    public static void main(String[] args) {
       
        int intValue = 42;
        double doubleValue = 3.14;
        boolean booleanValue = true;
       
        boolean result = (intValue < doubleValue);
		System.out.println("Int value is : " + intValue);
		System.out.println("Double value is : " + doubleValue);
        System.out.println("Result of the boolean expression (intValue < doubleValue): " + result);
    }
}
