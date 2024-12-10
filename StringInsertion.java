public class StringInsertion 
{
    public static void main(String[] args) 
    {
        String originalString = "Hello World!";
        String stringToInsert = "Beautiful ";
        int position = 6;
        String resultString = insertString(originalString, stringToInsert, position);
        System.out.println("Original String: " + originalString);
        System.out.println("String to Insert: " + stringToInsert);
        System.out.println("Resultant String: " + resultString);
    }
    public static String insertString(String original, String toInsert, int position) 
    {
        if (position < 0 || position > original.length()) 
        {
            throw new IllegalArgumentException("Invalid position");
        }
        return original.substring(0, position) + toInsert + original.substring(position);
    }
}
