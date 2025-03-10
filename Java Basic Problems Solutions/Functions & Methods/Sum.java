import java.util.Scanner;

public class Sum {

    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = in.nextInt();
        System.out.print("Enter number 3: ");
        int num3 = in.nextInt();
        int sum = num1 + num2 + num3;
        System.out.print("The sum = " + sum);
    }

    public static void main(String[] args) {
        // Q: take input of 2 numbers and print the sum.
        sum();
    }
}