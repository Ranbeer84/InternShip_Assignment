public class JavaInstallationCheck {
    public static void main(String[] args) {
        // Retrieve system properties related to Java installation
        String javaVersion = System.getProperty("java.version");
        String javaRuntimeVersion = System.getProperty("java.runtime.version");
        String javaHome = System.getProperty("java.home");
        String javaVendor = System.getProperty("java.vendor");
        String javaVendorURL = System.getProperty("java.vendor.url");
        String javaClassPath = System.getProperty("java.class.path");

        System.out.println("Checking Java installation on this system...\n");

        System.out.println("Java Version         : " + javaVersion);
        System.out.println("Java Runtime Version : " + javaRuntimeVersion);
        System.out.println("Java Home            : " + javaHome);
        System.out.println("Java Vendor          : " + javaVendor);
        System.out.println("Java Vendor URL      : " + javaVendorURL);
        System.out.println("Java Class Path      : " + javaClassPath);
    }
}