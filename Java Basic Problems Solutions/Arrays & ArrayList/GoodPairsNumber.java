import java.util.Arrays;
import java.util.Scanner;

public class GoodPairsNumber {

    // Q: LeetCode Problem 1512: Number of Good Pairs

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of your Array: ");
        int n = in.nextInt();
        System.out.print("Enter the elements of your Array: ");

        int[] nums = new int[n];
        for(int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }
        System.out.print(Arrays.toString(nums) + " are the elements of your Array.\n");

        // Finding the number of good pairs
        int count = 0;
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {  // Ensures i < j
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
        }
        System.out.println("Number of good pairs: " + count);
    }
}
