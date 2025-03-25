//insert a word into a string at given index
import java.util.Scanner;

public class StringInsertion 
{
    public static String insertString(String original, String toInsert, int index) 
    {
        if (index < 0 || index > original.length()) 
        {
            return "Invalid index";
        }

        // Convert the original string to a character array
        char[] originalArray = original.toCharArray();
        char[] toInsertArray = toInsert.toCharArray();
        char[] newArray = new char[originalArray.length + toInsertArray.length];

        // Copy characters from original string up to the index
        int i;
        for (i = 0; i < index; i++) {
            newArray[i] = originalArray[i];
        }

        // Copy characters from the string to be inserted
        for (int j = 0; j < toInsertArray.length; j++, i++) {
            newArray[i] = toInsertArray[j];
        }

        // Copy the remaining characters from the original string
        for (int k = index; k < originalArray.length; k++, i++) {
            newArray[i] = originalArray[k];
        }

        // Convert char array back to string
        String result = "";
        for (char c : newArray) {
            result += c;
        }

        return result;
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the original string: ");
        String original = scanner.nextLine();

        System.out.print("Enter the string to insert: ");
        String toInsert = scanner.nextLine();

        System.out.print("Enter the index at which to insert: ");
        int index = scanner.nextInt();

        String result = insertString(original, toInsert, index);
        System.out.println("Resultant string: " + result);
        
        scanner.close();
    }
}
