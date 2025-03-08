import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number of your choice : ");
        int num = input.nextInt();
        if(num % 2 == 0) {
            System.out.println("Chosen number is Even.");
        } else {
            System.out.println("Chosen number is Odd.");
        }


    }
}
