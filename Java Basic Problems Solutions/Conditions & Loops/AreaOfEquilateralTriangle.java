import java.util.Scanner;

public class AreaOfEquilateralTriangle {
    public static void main(String[] args) {

        // Find the area of Equilateral Triangle ?

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the sides of your equilateral triangle: ");
        int s = in.nextInt();

        double area = 0.43 * s * s;

        System.out.print("Area of your Equilateral Triangle is : " + area);

    }
}
