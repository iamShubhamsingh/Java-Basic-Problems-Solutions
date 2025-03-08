import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args) {

        // Q: Find the volume of a cylinder ?

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius of your cylinder's base circle: ");
        int r = in.nextInt();
        System.out.print("Enter the height of your cylinder: ");
        int h = in.nextInt();

        double volume = 3.14 * r * r * h;

        System.out.print("Volume of your Cylinder is : " + volume);

    }
}
