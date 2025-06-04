import java.util.Scanner;

public class RectangleCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter width: ");
        double width = scanner.nextDouble();

        System.out.print("Enter height: ");
        double height = scanner.nextDouble();

        double area = width * height;
        double perimeter = 2 * (width + height);

        System.out.printf("Area is %.1f * %.1f = %.2f%n", width, height, area);
        System.out.printf("Perimeter is 2 * (%.1f + %.1f) = %.2f%n", width, height, perimeter);

        scanner.close();
    }
}