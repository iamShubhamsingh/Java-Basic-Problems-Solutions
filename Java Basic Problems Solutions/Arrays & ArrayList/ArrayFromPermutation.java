import java.util.Arrays;
import java.util.Scanner;

public class ArrayFromPermutation {

    // Q: LeetCode Problem 1920: Array From Permutation.

    public static void main(String[] args) {
        // Applying the logic here
        Scanner in = new Scanner(System.in);
        int[] nums = new int[6];
        for(int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(nums) + " is your entered choice.");

        int[] ans = new int[nums.length];

        for(int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }

        System.out.println(Arrays.toString(ans) + " is the build array from permutation.");
    }
}
