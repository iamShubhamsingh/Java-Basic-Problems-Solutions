import java.util.Scanner;

public class VolumeOfPyramid {
    public static void main(String[] args) {

        // Q: Find the volume of a pyramid ?

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of your pyramid's base: ");
        int l = in.nextInt();
        System.out.print("Enter the width of your pyramid's base: ");
        int w = in.nextInt();
        System.out.print("Enter the height of your prism: ");
        int h = in.nextInt();

        int B = l * w;

        double volume = 0.33 * B * h;

        System.out.print("Volume of your Pyramid is : " + volume);

    }
}
