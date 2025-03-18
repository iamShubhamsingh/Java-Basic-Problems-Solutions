import java.util.Arrays;
import java.util.Scanner;

public class RichestCustomerWealth {

    // Q: LeetCode Problem 1672: Richest Customer Wealth

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of customers: ");
        int a = in.nextInt();
        System.out.print("Enter the number of bank accounts per user: ");
        int b = in.nextInt();
        System.out.print("Enter your data: ");

        int[][] accounts = new int[a][b];
        for(int i = 0; i < a; i++) {
            for(int j = 0; j < b; j++) {
                accounts[i][j] = in.nextInt();
            }
        }
        System.out.print("The entered customer wealth data is: ");
        for(int[] row : accounts) {
            System.out.print(Arrays.toString(row));
        }

        // Finding the richest customer
        int maxWealth = 0;
        for(int i = 0; i < a; i++) {
            int sum = 0;
            for(int j = 0; j < b; j++) {
                sum += accounts[i][j];  // Summing up the wealth of each customer
            }
            maxWealth = Math.max(maxWealth, sum);  // Keeping track of the maximum wealth
        }

        System.out.print("\nThe Richest Customer Wealth is: " + maxWealth);
    }
}
