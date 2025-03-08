import java.util.Scanner;

public class PerimeterOfRhombus {
    public static void main(String[] args) {

        // Q: Find the perimeter of rhombus ?

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the sides of your rhombus: ");
        int s = in.nextInt();

        double perimeter = 4 * s;

        System.out.print("Perimeter of your Rhombus is : " + perimeter);

    }
}
