import java.util.*;
class zeroOne
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter he number to convert:");
        int n=sc.nextInt();
        int temp=n;
        int sum =0;
        int x=1;
        while(temp!=0)
        {
            int d=temp%10;
            if(d==0)
            {
                sum=sum+x*1;
            }
            else
            {
                sum=sum+x*d;    
            }
            temp=temp/10;
            x=x*10;
        }
        System.out.println(sum);
        sc.close();
    }
}