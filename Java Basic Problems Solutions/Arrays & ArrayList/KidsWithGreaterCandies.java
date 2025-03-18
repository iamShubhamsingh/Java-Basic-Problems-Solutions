import java.util.Arrays;
import java.util.Scanner;

public class KidsWithGreaterCandies {

    // Q: LeetCode Problem 1431: Kids with the Greatest Number of Candies.

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the total number of kids with candies: ");
        int n = in.nextInt();

        System.out.print("Enter the total number of candies each kid have: ");

        int[] candies = new int[n];

        // Input candies array
        for(int i = 0; i < candies.length; i++) {
            candies[i] = in.nextInt();
        }
        System.out.print(Arrays.toString(candies) + " candies kids has.\n");

        System.out.print("Enter the number of extra candies we have: ");
        int extraCandies = in.nextInt();

        // Finding the maximum candies any kids has
        int maxCandies = 0;
        for(int candy : candies) {
            if(candy > maxCandies) {
                maxCandies = candy;
            }
        }

        boolean[] result = new boolean[n];

        for(int i = 0; i < n; i++) {
            result[i] = (candies[i] + extraCandies >= maxCandies);
        }

        System.out.println("Result: " + Arrays.toString(result));
    }
}
