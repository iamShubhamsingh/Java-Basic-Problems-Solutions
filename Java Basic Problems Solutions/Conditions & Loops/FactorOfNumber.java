import java.util.Scanner;

public class FactorOfNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number of your choice: ");
        int a = in.nextInt();

        for(int i = 1; i <= a; i++) {
            if(a % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
