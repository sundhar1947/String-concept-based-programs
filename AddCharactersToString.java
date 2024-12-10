import java.util.Scanner;
public class AddCharactersToString {
    public static void main(String[] args) {
        // Create a scanner to take user input
        Scanner scanner = new Scanner(System.in);

        // Read the original string
        System.out.println("Enter the original string:");
        String originalString = scanner.nextLine();

        // Read the characters to add
        System.out.println("Enter the character(s) to add:");
        String charactersToAdd = scanner.nextLine();

        // Concatenate the strings
        String updatedString = originalString + charactersToAdd;

        // Output the updated string
        System.out.println("Updated string: " + updatedString);

        // Close the scanner
        scanner.close();
    }
}
