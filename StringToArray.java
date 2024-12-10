import java.util.Scanner;
public class StringToArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        String[] wordsArray = input.split(" ");
        System.out.print("Output array: [");
        for (int i = 0; i < wordsArray.length; i++) {
            System.out.print(wordsArray[i]);
            if (i < wordsArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        scanner.close();
    }
}
