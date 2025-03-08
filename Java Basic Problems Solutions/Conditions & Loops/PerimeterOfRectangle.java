import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {

        // Find the perimeter of Rectangle ?

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of your Rectangle: ");
        int l = in.nextInt();
        System.out.print("Enter the breadth of your Rectangle: ");
        int b = in.nextInt();

        double perimeter = 2 * (l + b);

        System.out.print("Perimeter of your Rectangle is : " + perimeter);

    }
}
