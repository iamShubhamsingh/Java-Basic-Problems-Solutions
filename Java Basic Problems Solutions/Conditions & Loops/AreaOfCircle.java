import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {

        // Q: Find the Area of the Circle ?

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius of your circle: ");
        int r = in.nextInt();

        double area = (3.14 * r * r);

        System.out.print("Area of the circle is : " + area);
    }
}
