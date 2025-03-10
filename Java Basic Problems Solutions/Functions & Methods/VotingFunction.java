import java.util.Scanner;

public class VotingFunction {

    // Q: A person is eligible to vote if his/her age is above 18. Write a method to check whether he/she is eligible to vote or not.

    static void vote(int a){
        if(a >= 18) {
            System.out.print("Congratulations!!! You are eligible to vote.");
        } else {
            System.out.print("Oops!!! You are not eligible to vote.");
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = in.nextInt();

        // Calling out the method
        vote(age);
    }
}
