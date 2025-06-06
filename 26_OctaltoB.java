import java.util.Scanner;

public class OctalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an octal number: ");
        String octal = sc.nextLine();

        int decimal = Integer.parseInt(octal, 8);

        String binary = Integer.toBinaryString(decimal);

        System.out.println("Equivalent Binary Number: " + binary);
    }
}