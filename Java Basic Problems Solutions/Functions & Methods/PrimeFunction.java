import java.util.Scanner;

public class PrimeFunction {

    // Q: Define a method to check whether a number is prime or not.

    static void prime(int a) {
        if(a <= 1) {
            System.out.print("Entered number is not a prime number.");
            return;
        }
        for(int i = 2; i <= (int)Math.sqrt(a); i++) {
            if (a % i == 0) {
                System.out.print("Entered number is not a prime number.");
                return;
            }
        }
        System.out.print("Entered number is a prime number.");
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();

        // Calling out the method
        prime(num);
    }
}
