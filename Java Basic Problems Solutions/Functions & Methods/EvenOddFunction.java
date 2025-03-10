import java.util.Scanner;

public class EvenOddFunction {

    // Q: Write a method to print the odd and even numbers by taking input from the user.
    static void oddEven(int a) {
        if (a % 2 == 0) {
            System.out.println("Entered number is EVEN.");
        } else {
            System.out.println("Entered number is ODD.");
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter any number of your choice: ");
        int num = in.nextInt();

        // Calling the methods
        oddEven(num);
    }
}
