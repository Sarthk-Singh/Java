import java.util.*;
class modString
{
    public static void preDef(String str,String word,int pos)
    {
        StringBuffer ob=new StringBuffer();
        ob.append(word,pos,4+pos);
        System.out.println(str);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter the string: ");
        String str=sc.next();
        
        System.out.print("Enter the word to insert: ");
        String word=sc.next();
        
        System.out.print("Enter the position to insert the word: ");
        int pos=sc.nextInt();
        
        char strA[]=str.toCharArray();
        char wordA[]=word.toCharArray();
        int sl=str.length();
        int wl=word.length();
        String newStr="";
        
        for(int i=0;i<pos;i++)
        {
            newStr+=strA[i];
        }
        for(int i=0;i<wl;i++)
        {
            newStr+=wordA[i];
        }
        for(int i=pos;i<sl;i++)
        {
            newStr+=strA[i];
        }
        System.out.println("New String: "+newStr);
        preDef(str,word,pos);
        sc.close();
    }
}