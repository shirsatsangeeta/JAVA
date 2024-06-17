public class InstallationDirectoryFinder {
    public static void main(String[] args) {
        String installationDirectory = getInstallationDirectory();
        System.out.println("Installation Directory: " + installationDirectory);
    }

    public static String getInstallationDirectory() {
        // Get the location of the current class (Assuming it's in the installation directory)
        String classLocation = InstallationDirectoryFinder.class.getProtectionDomain().getCodeSource().getLocation().getPath();

        // If running from a JAR file, extract the directory
        if (classLocation.endsWith(".jar")) {
            int lastIndexOfSlash = classLocation.lastIndexOf("/");
            return classLocation.substring(0, lastIndexOfSlash + 1);
        } else {
            // If running from the IDE or as loose class files, return the current working directory
            return System.getProperty("user.dir");
        }
    }
}
