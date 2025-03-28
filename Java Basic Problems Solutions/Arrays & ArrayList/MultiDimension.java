import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

//        int[][] arr = {{1, 2, 3}, {2, 3, 4}, {3, 4, 5}};
//        System.out.println(Arrays.toString(arr[1]));

        int[][] arr = new int[3][2];
        int[][] arr2D = {
                {1,2,3},  // 0th index
                {4,5},    // 1st index
                {6,7,8,9} // 2nd index
        };

        // input
        for (int row = 0; row < arr.length; row++) {
            // for each column in every row
            for(int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }
    }
}
