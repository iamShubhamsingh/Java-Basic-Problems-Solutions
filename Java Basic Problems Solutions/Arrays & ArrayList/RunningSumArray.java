import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Long.sum;

public class RunningSumArray {

    // Q: LeetCode Problem 1480: Running Sum Of 1D Array

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

        // Implementing Running Sum of 1D Array
        int[] runningSum = new int[nums.length];

        runningSum[0] = nums[0];

        for(int i = 1; i < nums.length; i++) {
            nums[i] = nums[i-1] + nums[i];
            runningSum[i] = nums[i];
        }
        System.out.println(Arrays.toString(runningSum) + " is your answer.");
    }
}
