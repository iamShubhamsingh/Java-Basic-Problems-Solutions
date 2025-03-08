import java.util.Scanner;

public class PrintNumbers {
    public static void main(String[] args) {

        // Q: Print numbers from 1 to n, and take the user input for n.

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the range of numbers you want to print: ");
        int n = input.nextInt();

        for (int num = 1; num <= n; num++ ) {
            System.out.print(num + " ");
        }
    }
}
