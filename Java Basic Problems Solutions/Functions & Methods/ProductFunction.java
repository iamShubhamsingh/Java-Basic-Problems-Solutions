import java.util.Scanner;

public class ProductFunction {

    // Q: Define a method that returns the product of two numbers & take the input through users.

    static void product(int a, int b) {
        int prod = a * b;
        System.out.print("Product of your numbers is: " + prod);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int num1 = in.nextInt();
        System.out.print("Enter your second number: ");
        int num2 = in.nextInt();

        // Calling out the methods
        product(num1, num2);
    }
}
