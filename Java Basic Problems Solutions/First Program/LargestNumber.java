import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num1 = input.nextInt();
        System.out.print("Enter another number : ");
        int num2 = input.nextInt();
        if (num1 > num2) {
            System.out.print(num1 + " is greater than " + num2);
        } else {
            System.out.print(num2 + " is greater than " + num1);
        }
    }
}
