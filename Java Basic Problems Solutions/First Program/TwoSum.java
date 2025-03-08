import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your first number : ");
        int firstNum = input.nextInt();
        System.out.println("Please enter your second number : ");
        int secondNum = input.nextInt();
        int totalSum = firstNum + secondNum;
        System.out.println("Your first choice was " + firstNum + " & your second choice was " + secondNum);
        System.out.println("Total of your chosen numbers : " + totalSum);
    }
}
