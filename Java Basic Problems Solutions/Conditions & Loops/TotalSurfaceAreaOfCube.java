import java.util.Scanner;

public class TotalSurfaceAreaOfCube {
    public static void main(String[] args) {

        // Q: Find the total surface area of a cube ?

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the sides of your cube: ");
        int s = in.nextInt();

        double tsa = 6 * (s * s);

        System.out.print("Total Surface Area of your Cube is : " + tsa);

    }
}
