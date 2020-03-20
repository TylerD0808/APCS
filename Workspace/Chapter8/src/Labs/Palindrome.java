import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String s = scan.nextLine();

        System.out.println();

        if (palindrome(s) == true) {
            System.out.println(s + " is a palindrome");
        } else {
            System.out.println(s + " is NOT a palindrome");
        }
    }

    public static boolean palindrome(String s) {
        if (s.length() <= 1) {
            return true;
        } else if (s.charAt(0) == s.charAt(s.length() - 1)) {
            return palindrome(s.substring(1, s.length() - 1));
        } else {
            return false;
        }
    }
}