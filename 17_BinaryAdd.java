import java.util.Scanner;

public class BinaryAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input first binary number: ");
        String b1 = sc.nextLine();
        System.out.print("Input second binary number: ");
        String b2 = sc.nextLine();

        int num1 = Integer.parseInt(b1, 2);
        int num2 = Integer.parseInt(b2, 2);

        int sum = num1 + num2;

        String binarySum = Integer.toBinaryString(sum);

        System.out.println("Sum of two binary numbers :" + binarySum);
    }
}