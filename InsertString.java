import java.util.Scanner;
public class InsertString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the main string:");
        String mainString = scanner.nextLine();
        System.out.println("Enter the string to insert:");
        String stringToInsert = scanner.nextLine();
        System.out.println("Enter the position to insert the string:");
        int position = scanner.nextInt();
        if (position < 0 || position > mainString.length()) {
            System.out.println("Invalid position! Please enter a position between 0 and " + mainString.length());
        } else {
            String result = mainString.substring(0, position) + stringToInsert + mainString.substring(position);
            System.out.println("Resultant string after insertion:");
            System.out.println(result);
        }
        scanner.close();
    }
}
