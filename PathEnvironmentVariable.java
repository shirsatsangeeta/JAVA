public class PathEnvironmentVariable {
    public static void main(String[] args) {
        String pathValue = System.getenv("PATH");

        if (pathValue != null) {
            System.out.println("PATH Environment Variable Value: " + pathValue);
        } else {
            System.out.println("PATH Environment Variable is not set.");
        }
    }
}
