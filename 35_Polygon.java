import java.util.Scanner;

public class PolygonArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of sides
        System.out.print("Input the number of sides on the polygon: ");
        int n = scanner.nextInt();

        System.out.print("Input the length of one of the sides: ");
        double s = scanner.nextDouble();

        double area = (n * s * s) / (4 * Math.tan(Math.PI / n));

        System.out.printf("The area is %.2f\n", area);

        scanner.close();
    }
}