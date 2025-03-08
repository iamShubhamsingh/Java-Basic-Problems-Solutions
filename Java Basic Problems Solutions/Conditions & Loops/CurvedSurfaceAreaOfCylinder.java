import java.util.Scanner;

public class CurvedSurfaceAreaOfCylinder {
    public static void main(String[] args) {

        // Q: Find the curved surface area of a cylinder ?

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius of your cylinder's base circle: ");
        int r = in.nextInt();
        System.out.print("Enter the height of your cylinder: ");
        int h = in.nextInt();

        double csa = 2 * 3.14 * r * h;

        System.out.print("Curved Surface Area of Cylinder is : " + csa);

    }
}
