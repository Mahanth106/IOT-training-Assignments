import java.util.Scanner;
public class PalindromeCheck {
    static boolean isPalindrome(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return str.equals(reversed);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(isPalindrome(input) ? "Palindrome" : "Not Palindrome");
        sc.close();
    }
}