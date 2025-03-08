import java.util.Scanner;

public class SubtractProductSumOfInteger {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an Integer: ");
        int a = in.nextInt();

        int sum = 0;
        int product = 1;

        while (a > 0) {
            int digits = a % 10;
            sum += digits;
            product *= digits;
            a = a/10;
        }

        System.out.print("After Subtracting Sum from Product we get : " + (product - sum));
    }
}
