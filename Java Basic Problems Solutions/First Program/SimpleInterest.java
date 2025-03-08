import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the principal amount :");
        int p = input.nextInt();
        System.out.print("Enter the rate amount :");
        int r = input.nextInt();
        System.out.print("Enter the time amount :");
        int t = input.nextInt();
        int si = ((p*r*t)/100);
        System.out.print("Your Simple Interest will be : " + si);

    }

}
