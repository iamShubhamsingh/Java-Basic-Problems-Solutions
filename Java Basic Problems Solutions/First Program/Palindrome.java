import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word to check, it is a palindrome or not : ");
        String s = input.next();

        int left = 0;
        int right = s.length() - 1;

        while(left < right) {
            if(s.charAt(left) != s.charAt(right)) {
                System.out.println("Not a valid Palindrome.");
            } else {
                left++;
                right--;
            }
        }
        System.out.println("Is a valid Palindrome.");
    }
}
