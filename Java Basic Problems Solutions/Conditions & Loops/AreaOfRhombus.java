import java.util.Scanner;

public class AreaOfRhombus {
    public static void main(String[] args) {

        // Find the area of Rectangle ?

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the base of your Rhombus: ");
        int b = in.nextInt();
        System.out.print("Enter the height of your Rhombus: ");
        int h = in.nextInt();

        double area = b * h;

        System.out.print("Area of your Rhombus is : " + area);

    }
}
