import java.util.Scanner;

public class PerimeterOfSquare {
    public static void main(String[] args) {

        // Q: Find the perimeter of square ?

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the sides of your square: ");
        int s = in.nextInt();

        double perimeter = 4 * s;

        System.out.print("Perimeter of your Square is : " + perimeter);

    }
}
