import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount in Rupee to check the USD conversion rate : ");
        int amount = input.nextInt();
        int conversion = amount * 80;
        System.out.print("On conversion you will get : " + conversion);
    }
}
