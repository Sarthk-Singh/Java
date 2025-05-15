//counting palendrome words from a file q18 in java lab manual
import java.io.*;

class palInFile 
{
    public static boolean isPalindrome(String word) 
    {
        String lower = word.toLowerCase();
        int left = 0, right = lower.length() - 1;
        while (left < right) 
        {
            if (lower.charAt(left++) != lower.charAt(right--)) return false;
        }
        return true;
    }
    public static void main(String[] args) 
    {
        int count = 0;
        StringBuilder word = new StringBuilder();

        try {
            FileInputStream fis = new FileInputStream("/Users/sarthaksingh/Documents/Sarthak Singh-B2:56(2319524)/Java/myFile.txt");
            int ch;

            while ((ch = fis.read()) != -1) {
                char c = (char) ch;

                if (Character.isLetterOrDigit(c)) {
                    word.append(c); // build word
                } else {
                    if (word.length() > 0) {
                        if (isPalindrome(word.toString())) {
                            count++;
                        }
                        word.setLength(0); // reset for next word
                    }
                }
            }

            // Check the last word if file didn't end with space/punctuation
            if (word.length() > 0 && isPalindrome(word.toString())) {
                count++;
            }

            fis.close();
            System.out.println("🔁 Number of palindrome words: " + count);
        } catch (IOException e) {
            System.out.println("💥 Error reading file.");
            e.printStackTrace();
        }
    }   
}
