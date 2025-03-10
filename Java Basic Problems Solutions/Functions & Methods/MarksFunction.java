import java.util.Scanner;

public class MarksFunction {

    // Q: Write a program that will ask the user to enter his/her marks (out of 100).
    // Define a method that will display grades according to the marks entered as below:
    //    Marks        Grade
    //   91-100         AA
    //   81-90          AB
    //   71-80          BB
    //   61-70          BC
    //   51-60          CD
    //   41-50          DD
    //   <=40          Fail

    static void marks(int a) {
        if(a > 90 && a <= 100) {
            System.out.print("Your grade is: AA.");
        } else if (a > 80 && a <= 90) {
            System.out.print("Your grade is: AB.");
        } else if (a > 70 && a <= 80) {
            System.out.print("Your grade is: BB.");
        } else if (a > 60 && a <= 70) {
            System.out.print("Your grade is: BC.");
        } else if (a > 50 && a <= 60) {
            System.out.print("Your grade is: CD.");
        } else if (a > 40 && a <= 50) {
            System.out.print("Your grade is: DD.");
        } else {
            System.out.print("Your grade is: FAIL.");
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter your marks (out of 100): ");
        int marks = in.nextInt();

        // Calling out the method
        marks(marks);
    }
}
