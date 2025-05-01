//wap to print all possible permutations of the input string
import java.util.Arrays;

public class SimplePermutations {
    public static void main(String[] args) {
        String str = "AAB"; // Change this for different inputs
        System.out.println("Distinct Permutations:");
        char[] chars = str.toCharArray();
        Arrays.sort(chars); // Sort to handle duplicates easily
        permute(chars, 0);
    }

    static void permute(char[] chars, int index) 
    {
        if (index == chars.length) {
            System.out.println(new String(chars)); // Print the valid permutation
            return;
        }

        for (int i = index; i < chars.length; i++) 
        {
            if (i > index && chars[i] == chars[index]) continue; // Skip duplicates

            swap(chars, index, i); // Swap to fix a character at 'index'
            permute(chars, index + 1); // Recurse for the next character
            swap(chars, index, i); // Backtrack to original order
        }
    }

    static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
}
