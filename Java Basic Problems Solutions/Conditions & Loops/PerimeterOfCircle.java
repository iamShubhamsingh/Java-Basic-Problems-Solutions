import java.util.Scanner;

public class PerimeterOfCircle {
    public static void main(String[] args) {

        // Q: Find the Perimeter of the Circle ?

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius of your circle: ");
        int r = in.nextInt();

        double perimeter = (2 * 3.14 * r);

        System.out.print("Perimeter of the circle is : " + perimeter);
    }
}
