import java.util.Scanner;

public class VolumeOfPrism {
    public static void main(String[] args) {

        // Q: Find the volume of a prism ?

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of your prism: ");
        int l = in.nextInt();
        System.out.print("Enter the width of your prism: ");
        int w = in.nextInt();
        System.out.print("Enter the height of your prism: ");
        int h = in.nextInt();

        int B = l * w;

        double volume = B * h;

        System.out.print("Volume of your Prism is : " + volume);

    }
}
