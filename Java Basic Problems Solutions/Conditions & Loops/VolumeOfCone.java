import java.util.Scanner;

public class VolumeOfCone {
    public static void main(String[] args) {

        // Q: Find the volume of a cone ?

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius of your cone's base circle: ");
        int r = in.nextInt();
        System.out.print("Enter the height of your cone: ");
        int h = in.nextInt();

        double volume = 0.33 * 3.14 * r * r * h;

        System.out.print("Volume of your Cone is : " + volume);

    }
}
