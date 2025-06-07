import java.util.Scanner;

public class PasswordInputFallback {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your password (visible): ");
        String password = scanner.nextLine();

        System.out.println("Your password is: " + password);
    }
}