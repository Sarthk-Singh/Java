import java.util.*;
class anagram
{
    public static boolean checkAnagram(String s1,String s2)
    {
        if(s1.length()!=s2.length())
            return false;
        
        int l=s1.length();
        int freq[]=new int [256];
        char str1[]=s1.toCharArray();
        char str2[]=s2.toCharArray();
        
        for(int i=0;i<l;i++)
        {
            freq[str1[i]]++;
        }
        for(int i=0;i<l;i++)
        {
            freq[str2[i]]--;
        }
        for(int i=0;i<l;i++)
        {
            if(freq[i]!=0)
                return false;
        }
        return true;

    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string 1: ");
        String str1=sc.next();
        System.out.print("Enter string 2: ");
        String str2=sc.next();

        boolean ans=checkAnagram(str1,str2);
        if(ans)
            System.out.println("Anagram!!");
        else
            System.out.println("Not Anagaram!!");
        sc.close();
    }
}