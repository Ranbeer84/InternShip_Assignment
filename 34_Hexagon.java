import java.util.Scanner;

public class HexagonArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the length of a side of the hexagon: ");
        double s = scanner.nextDouble();

        double area = (6 * s * s) / (4 * Math.tan(Math.PI / 6));

        System.out.printf("The area of the hexagon is: %.4f\n", area);

        scanner.close();
    }
}