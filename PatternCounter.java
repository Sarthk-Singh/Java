import java.util.Scanner;

public class PatternCounter 
{
    public static int countPatterns(String str) 
    {
        int count = 0;
        int i = 0;
        while (i < str.length() - 1) {
            if (str.charAt(i) == '0') {
                int j = i + 1;
                while (j < str.length() && str.charAt(j) == '1') {
                    j++;
                }
                if (j < str.length() && str.charAt(j) == '0' && j > i + 1) {
                    System.out.println(str.substring(i,j+1));
                    count++;
                    i = j;
                } else {
                    i++;
                }
            } else {
                i++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        int patternCount = countPatterns(input);
        System.out.println("Number of patterns found: " + patternCount);
        scanner.close();
    }
}

