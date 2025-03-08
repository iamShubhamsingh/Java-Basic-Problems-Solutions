import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {

        // Find the area of Rectangle ?

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of your Rectangle: ");
        int l = in.nextInt();
        System.out.print("Enter the breadth of your Rectangle: ");
        int b = in.nextInt();

        double area = l * b;

        System.out.print("Area of your Rectangle is : " + area);

    }
}
