class MyOwnException extends Exception {
    MyOwnException(String msg) {
        super(msg);
    }
}
class JavaApp {
    public static void main(String[] args) {
        try {
            int age = 130; // Fixed missing assignment operator "="
            if (age >= 100)
                throw new MyOwnException("Age = " + age + " It's not possible");
        } catch (MyOwnException ex) { // Added curly braces for try-catch block
            System.out.println(ex);
        }
        System.out.println("Execution Complete");
    }
}
