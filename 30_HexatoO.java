import java.util.Scanner;

public class HexToOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a hexadecimal number: ");
        String hex = sc.nextLine();

        int decimal = Integer.parseInt(hex, 16);

        String octal = Integer.toOctalString(decimal);

        System.out.println("Equivalent of Octal Number: " + octal);
    }
}