import java.util.Scanner;

public class HexToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a hexadecimal number: ");
        String hex = sc.nextLine();

        int decimal = Integer.parseInt(hex, 16);

        String binary = Integer.toBinaryString(decimal);

        System.out.println("Equilalent Binary Number: " + binary);
    }
}