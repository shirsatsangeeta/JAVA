 class ExplicitTypeCasting {
          public static void main(String[] args) {
        int intValue = 10;
        long longValue = intValue; 
        float floatValue = longValue; 
        double doubleValue = floatValue; 

        System.out.println("\n Implicit Typecasting (Widening):");
        System.out.println("int to long: " + longValue);
        System.out.println("long to float: " + floatValue);
        System.out.println("float to double: " + doubleValue);

         double anotherDoubleValue = 15.75;
        float anotherFloatValue = (float) anotherDoubleValue; 
        long anotherLongValue = (long) anotherFloatValue;
        int anotherIntValue = (int) anotherLongValue; 

        System.out.println("\n Explicit Typecasting (Narrowing):");
        System.out.println("double to float: " + anotherFloatValue);
        System.out.println("float to long: " + anotherLongValue);
        System.out.println("long to int: " + anotherIntValue);
		
		// Loss of the data is Observed hear.
    }
}
