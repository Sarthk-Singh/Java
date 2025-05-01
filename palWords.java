import java.util.*;
import java.io.*;
class palWords
{
    public static boolean isPal(String s)
    {
        StringBuilder word=new StringBuilder(s);
        String rev=word.reverse().toString();
        if(s.equalsIgnoreCase(rev))
        {
            System.out.println(s);
            return true;
        }
        return false;
    }
    public static void main(String args[])
    {
        try
        {
            Scanner sc=new Scanner(new File("/home/gehu/Desktop/java/myFile.txt"));
            int count=0;
            while(sc.hasNext())
            {
                String word=sc.next();
                if(isPal(word))
                    count++;
            }
            System.out.println("Number of palendrome words: "+count);
            sc.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File not found");
            e.getStackTrace();
        }
    }
}