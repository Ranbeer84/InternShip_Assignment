import java.io.File;
import java.util.Scanner;

public class FileSizeFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the full path of the file: ");
        String filePath = scanner.nextLine();

        File file = new File(filePath);

        if (file.exists() && file.isFile()) {
            long fileSizeInBytes = file.length();
            System.out.println("File size: " + fileSizeInBytes + " bytes");
        } else {
            System.out.println("File not found or it is not a regular file.");
        }

        scanner.close();
    }
}
