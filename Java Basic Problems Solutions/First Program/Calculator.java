import java.sql.SQLOutput;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num1 = input.nextInt();
        System.out.println("Enter another number : ");
        int num2 = input.nextInt();
        System.out.println("Enter what operation you want to perform : 1 - Addition, 2 - Subtraction, 3 - Multiplication & 4 - Division");
        int operation = input.nextInt();
        if(operation == 1) {
            System.out.println(num1 + num2);
        } else if (operation == 2) {
            System.out.println(num1 - num2);
        } else if (operation == 3) {
            System.out.println(num1 * num2);
        } else {
            System.out.println(num1 / num2);
        }
    }
}
