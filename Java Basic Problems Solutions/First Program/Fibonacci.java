import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number for which you want to check the Fibonacci series : ");
        int n = input.nextInt();
        int num1 = 0;
        int num2 = 1;
        for(int i = 0; i < n; i++) {
            System.out.print(num1 + " ");

            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }
    }
}
