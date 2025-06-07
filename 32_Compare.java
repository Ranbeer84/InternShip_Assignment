import java.util.Scanner;

public class CompareTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Input second integer: ");
        int num2 = scanner.nextInt();

        if (num1 == num2) {
            System.out.println(num1 + " == " + num2);
        }
        if (num1 != num2) {
            System.out.println(num1 + " != " + num2);
        }
        if (num1 < num2) {
            System.out.println(num1 + " < " + num2);
        }
        if (num1 <= num2) {
            System.out.println(num1 + " <= " + num2);
        }
        if (num1 > num2) {
            System.out.println(num1 + " > " + num2);
        }
        if (num1 >= num2) {
            System.out.println(num1 + " >= " + num2);
        }

        scanner.close();
    }
}