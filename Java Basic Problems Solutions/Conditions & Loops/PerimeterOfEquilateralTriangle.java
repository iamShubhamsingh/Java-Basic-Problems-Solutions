import java.util.Scanner;

public class PerimeterOfEquilateralTriangle {
    public static void main(String[] args) {

        // Find the perimeter of Equilateral Triangle ?

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the sides of your equilateral triangle: ");
        int s = in.nextInt();

        double perimeter = 3 * s;

        System.out.print("Perimeter of your Equilateral Triangle is : " + perimeter);

    }
}
