import java.util.Scanner;
public class EvenLengthWords
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();
        String[] words = inputString.split("\\s+");
        System.out.println("Words with even length are:");
        for (String word : words) {
            if (word.length() % 2 == 0) {
                System.out.println(word);
            }
        }
        scanner.close();
    }
}