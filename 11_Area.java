import java.util.Scanner;

public class CircleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.printf("Perimeter of the circle: %.4f%n", perimeter);
        System.out.printf("Area of the circle: %.4f%n", area);
        
        scanner.close();
    }
}