import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {

        // Q: Take user input and let them know, the first word is in Uppercase or Lowercase letters.

        Scanner input = new Scanner(System.in);
        System.out.print("Enter any word: ");
        char ch = input.next().trim().charAt(0);
        if(ch > 'a' && ch <= 'z') {
            System.out.print("Your word starts with a lowercase letter.");
        } else if (ch > 'A' && ch <= 'Z') {
            System.out.print("Your word starts with an uppercase letter.");
        } else {
            System.out.print("Invalid input.");
        }
    }
}
