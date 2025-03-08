import java.util.Scanner;

public class LargestNumbers {
    public static void main(String[] args) {

        // Q: Find the largest of the 3 numbers by taking input from users?

        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = input.nextInt();
        System.out.print("Enter second number: ");
        int b = input.nextInt();
        System.out.print("Enter third number: ");
        int c = input.nextInt();

        if (a > b) {
            System.out.print(a > c ? a + " is Greatest." : c + " is Greatest.");
        } else if (b > c) {
            System.out.print(b + " is Greatest.");
        } else {
            System.out.print(c + " is Greatest.");
        }
    }
}
