import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class FileProcessor
{
    Scanner sc;
    int totalCount = 0;
    int palindromeCount = 0;

    public FileProcessor(String filename) throws FileNotFoundException
    {
        sc = new Scanner(new File(filename));
    }

    public synchronized String nextWord() 
    {
        if (sc.hasNext())
            return sc.next().replaceAll("[^a-zA-Z]", "").toLowerCase(); // only letters
        else
            return null;
    }

    public synchronized void incrementTotal() {
        totalCount++;
    }

    public synchronized void incrementPalindrome() {
        palindromeCount++;
    }

    public void close() {
        sc.close();
    }
}

class TotalWordsThread extends Thread 
{
    FileProcessor processor;

    public TotalWordsThread(FileProcessor processor) {
        this.processor = processor;
    }

    public void run() 
    {
        while (true) 
        {
            String word = processor.nextWord();
            if (word == null) 
                break;
            processor.incrementTotal();
        }
    }
}

class PalindromeWordsThread extends Thread 
{
    FileProcessor processor;

    public PalindromeWordsThread(FileProcessor processor) 
    {
        this.processor = processor;
    }

    public void run() 
    {
        while (true) 
        {
            String word = processor.nextWord();
            if (word == null) 
                break;
            if (isPalindrome(word)) 
                processor.incrementPalindrome();
            
        }
    }

    boolean isPalindrome(String word) 
    {
        int i = 0, j = word.length() - 1;
        while (i < j) 
        {
            if (word.charAt(i) != word.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

public class palCountThreading 
{
    public static void main(String[] args) 
    {
        try 
        {
            FileProcessor processor = new FileProcessor("/Users/sarthaksingh/Documents/Sarthak Singh-B2:56(2319524)/Java/myFile.txt");

            TotalWordsThread t1 = new TotalWordsThread(processor);
            PalindromeWordsThread t2 = new PalindromeWordsThread(processor);

            t1.start();
            t2.start();

            t1.join();
            t2.join();

            processor.close();

            System.out.println("Total words: " + processor.totalCount);
            System.out.println("Palindrome words: " + processor.palindromeCount);

        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
}
