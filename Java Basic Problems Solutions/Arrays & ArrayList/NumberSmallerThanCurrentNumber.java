import java.util.Arrays;
import java.util.Scanner;

public class NumberSmallerThanCurrentNumber {

    // Q: LeetCode Problem 1365: How many Numbers are Smaller Than the Current Number.

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of your Array: ");
        int n = in.nextInt();
        System.out.print("Enter the elements of your Array: ");

        int[] nums = new int[n];
        for(int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        System.out.print(Arrays.toString(nums) + " is your Array.");

        // Counting Smaller Numbers Than Current Number
        int[] result = new int[n];

        for(int i = 0; i < nums.length; i++) {
            int count = 0;  // Reset count for each number
            for(int j = 0; j < nums.length; j++) {
                if(j != i && nums[j] < nums[i]) {
                    count++;
                }
            }
            result[i] = count;  // Store count in the result array
        }

        System.out.println("\nNumbers Smaller Than Current Number are: " + Arrays.toString(result));
    }
}
