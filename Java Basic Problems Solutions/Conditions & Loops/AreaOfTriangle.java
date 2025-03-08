import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {

        // Find the area of Triangle ?

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the base of your triangle: ");
        int b = in.nextInt();
        System.out.print("Enter the height of your triangle: ");
        int h = in.nextInt();

        double area = 0.5 * b * h;

        System.out.print("Area of your Triangle is : " + area);

    }
}
