import java.util.Scanner;

class NegativeExcepltion extends RuntimeException
{
    NegativeExcepltion(String s)
    {
        super(s);
    }
}

class myCalculator
{
    void checkValidity(int n,int p)
    {
        if(n==0&&p==0)
        {
            throw new NegativeExcepltion("Both  and p cannot be 0");
        }
        if(n==0)
        {
            throw new NegativeExcepltion("N cannot be 0");
        }
        if(p<0||n<0)
        {
            throw new NegativeExcepltion("N or P cannot be negative");
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n in n^p: ");
        int n=sc.nextInt();
        System.out.print("Enter p in n^p: ");
        int p=sc.nextInt();
        myCalculator ob=new myCalculator();
        try
        {
            ob.checkValidity(n,p);
        }
        catch(NegativeExcepltion e)
        {
            System.out.println(e);
        }
        System.out.println("n^p= "+Math.pow(n, p));
        sc.close();
    }
}