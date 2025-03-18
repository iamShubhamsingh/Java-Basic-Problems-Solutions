import java.util.Arrays;
import java.util.Scanner;

public class ShuffleArray {

    // Q: LeetCode Problem 1470: Shuffle the Array

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value for n: ");
        int n = in.nextInt();

        System.out.print("Enter your Array Elements: ");

        int[] nums = new int[2*n];

        // Input nums array
        for(int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        System.out.print(Arrays.toString(nums) + " is your entered elements.\n");

        // Shuffling the array
        int[] shuffledArray = new int[nums.length];
        int index = 0;

        for(int i = 0; i < n; i++) {
            shuffledArray[index++] = nums[i];       // Taking from first half.
            shuffledArray[index++] = nums[i + n];   // Taking from second half.
        }
        System.out.println(Arrays.toString(shuffledArray) + " is your shuffled Array.");
    }

}
