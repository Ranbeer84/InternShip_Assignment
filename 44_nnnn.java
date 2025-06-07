import java.util.Scanner;

public class PatternSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        int nn = n * 10 + n;
        int nnn = n * 100 + nn;

        int result = n + nn + nnn;

        System.out.println(n + " + " + nn + " + " + nnn + " = " + result);

        scanner.close();
    }
}