import java.util.Scanner;
public class GetCharacterFromString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        System.out.println("Enter the index:");
        int index = scanner.nextInt();
        if (index >= 0 && index < input.length()) {
            char characterAtIndex = input.charAt(index);
            System.out.println("Character at index " + index + " is: " + characterAtIndex);
        } else {
            System.out.println("Invalid index! Please enter a valid index between 0 and " + (input.length() - 1));
        }
        scanner.close();
    }
}
