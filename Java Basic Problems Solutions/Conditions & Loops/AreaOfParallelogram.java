import java.util.Scanner;

public class AreaOfParallelogram {
    public static void main(String[] args) {

        // Find the area of Parallelogram ?

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the base of your Parallelogram: ");
        int b = in.nextInt();
        System.out.print("Enter the height of your Parallelogram: ");
        int h = in.nextInt();

        double area = b * h;

        System.out.print("Area of your Parallelogram is : " + area);

    }
}
