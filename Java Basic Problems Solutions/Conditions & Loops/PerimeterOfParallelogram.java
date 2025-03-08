import java.util.Scanner;

public class PerimeterOfParallelogram {
    public static void main(String[] args) {

        // Find the perimeter of Parallelogram ?

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the side of your Parallelogram: ");
        int a = in.nextInt();
        System.out.print("Enter the adjacent side of your Parallelogram: ");
        int b = in.nextInt();

        double perimeter = 2 * (a + b);

        System.out.print("Perimeter of your Parallelogram is : " + perimeter);

    }
}
