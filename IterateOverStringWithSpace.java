import java.util.Scanner;
public class IterateOverStringWithSpace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        System.out.println("Characters in the string with space:");
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            System.out.print(currentChar + " ");
        }
        scanner.close();
    }
}
