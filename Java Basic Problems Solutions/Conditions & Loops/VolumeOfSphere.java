import java.util.Scanner;

public class VolumeOfSphere {
    public static void main(String[] args) {

        // Q: Find the volume of a sphere ?

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius of your sphere: ");
        int r = in.nextInt();

        double volume = 1.33 * 3.14 * r * r * r;

        System.out.print("Volume of your Sphere is : " + volume);

    }
}
