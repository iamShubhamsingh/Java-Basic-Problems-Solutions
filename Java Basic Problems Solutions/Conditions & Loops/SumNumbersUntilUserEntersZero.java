import java.util.Scanner;

public class SumNumbersUntilUserEntersZero {
    public static void main(String[] args) {

        // Q: Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop).

        Scanner in = new Scanner(System.in);

        int sum = 0;

        while(true) {
            System.out.print("Enter an Integer to continue or else '0' to end the program: ");
            int num = in.nextInt();

            if(num == 0) {
                break;
            }

            sum += num;
        }

        System.out.print("The sum of your entered integers are: " + sum);
    }
}
