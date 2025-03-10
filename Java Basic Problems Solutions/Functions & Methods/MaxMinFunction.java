import java.util.Scanner;

public class MaxMinFunction {

    // Q: Define two methods to print the maximum & minimum number respectively among three numbers entered by the user.

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int num1 = in.nextInt();
        System.out.print("Enter your second number: ");
        int num2 = in.nextInt();
        System.out.print("Enter your third number: ");
        int num3 = in.nextInt();

        // Calling out the methods
        max(num1, num2, num3);
        min(num1, num2, num3);

    }

    static void max(int a, int b, int c) {

        if(a > b) {
            if(a > c) {
                System.out.print("Your first entered number is maximum i.e, " + a);
            } else {
                System.out.print("Your third entered number is maximum i.e, " + c);
            }
        } else if (b > c) {
            System.out.print("Your second entered number is maximum i.e, " + b);
        } else {
            System.out.print("Your third entered number is maximum i.e, " + c);
        }
    }

    static void min(int a, int b, int c) {

        if(a < b) {
            if(a < c) {
                System.out.print("Your first entered number is minimum i.e, " + a);
            } else {
                System.out.print("Your third entered number is minimum i.e, " + c);
            }
        } else if (b < c) {
            System.out.print("Your second entered number is minimum i.e, " + b);
        } else {
            System.out.print("Your third entered number is minimum i.e, " + c);
        }
    }

}
