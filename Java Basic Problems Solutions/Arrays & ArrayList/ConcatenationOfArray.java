import java.util.Arrays;
import java.util.Scanner;

public class ConcatenationOfArray {

    // Q: LeetCode Problem 1929: Concatenation of Array.

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of your Array: ");
        int n = in.nextInt();
        System.out.print("Enter your Array: ");

        // Taking user array input
        int[] nums = new int[n];
        for(int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(nums) + " is the Array you entered.");

        // Concatenating the array
        int[] ans = new int[2*nums.length];

        for(int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }
        System.out.println(Arrays.toString(ans) + " is the answer.");
    }
}
