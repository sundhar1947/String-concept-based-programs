import java.util.Scanner;
public class Palindrome 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();
        String cleanedString = inputString.replaceAll("\\s+", "").toLowerCase();
        if (isPalindrome(cleanedString)) 
        {
            System.out.println("The string is a palindrome.");
        } 
        else 
        {
            System.out.println("The string is not a palindrome.");
        }
        scanner.close();
    }
    public static boolean isPalindrome(String str) 
    {
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - 1 - i)) 
            {
                return false;
            }
        }
        return true;
    }
}