import java.util.Scanner;

public class SwapVariables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number (a): ");
        int a = scanner.nextInt();

        System.out.print("Enter second number (b): ");
        int b = scanner.nextInt();

        System.out.println("\nBefore swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("\nAfter swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        scanner.close();
    }
}

/*
Five different ways to swap two variables

1. Swapping Using a Temporary Variable

int a = 10, b = 20;
int temp = a;
a = b;
b = temp;

2. Swapping Without Using a Third Variable (Using Arithmetic)

int a = 10, b = 20;
a = a + b;
b = a - b;
a = a - b;

3. Swapping Without Using a Third Variable (Using Bitwise XOR)

int a = 10, b = 20;
a = a ^ b;
b = a ^ b;
a = a ^ b;

4. Swapping Using a Single Statement

int[] arr = {10, 20};
arr[0] = arr[0] + arr[1] - (arr[1] = arr[0]);

5. Swapping Using a Function (Encapsulating Logic)

public static void swap(int[] pair) {
    int temp = pair[0];
    pair[0] = pair[1];
    pair[1] = temp;
}


int[] pair = {10, 20};
swap(pair);


 */
