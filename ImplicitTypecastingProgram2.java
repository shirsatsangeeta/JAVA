class ImplicitTypecastingProgram2 {
    public static void main(String[] args) {
        
        int intValue = 10;
        long longValue = 20L;
        float floatValue = 15.5f;
        
        boolean result = intValue * longValue < floatValue;
			
        /*In this case intValue and longValue are implicitly 
		converted to float before the addition, and the result 
		is true since 30.0 is less than 15.5.*/ 
		
		System.out.println("Int value is : " + intValue);
		System.out.println("Long value is : " + longValue);
		System.out.println("Float value is : " + floatValue);
        System.out.println("Result of the boolean expression (intValue * longValue < floatValue): " + result);
    }
}
