import java.util.Scanner;

public class decendingString 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.next();
        sc.close();

        int[] freq = new int[256]; // ASCII frequency array
        for (char ch : input.toCharArray()) {
            freq[ch]++; // Counting occurrences
        }

        char[] chars = new char[256];
        int index = 0;

        for (int i = 0; i < 256; i++) 
        {
            if (freq[i] > 0) 
            {
                chars[index++] = (char) i;
            }
        }

        for (int i = 0; i < index - 1; i++) // Bubble Sort based on frequency
        {
            for (int j = i + 1; j < index; j++) 
            {
                if (freq[chars[i]] < freq[chars[j]]) 
                { 
                    char temp = chars[i];
                    chars[i] = chars[j];
                    chars[j] = temp;
                }
            }
        }

        String result = "";
        for (int i = 0; i < index; i++) {
            for (int j = 0; j < freq[chars[i]]; j++) { // Repeat character based on frequency
                result += chars[i];
            }
        }

        System.out.println("Sorted Output: " + result);
    }
}
