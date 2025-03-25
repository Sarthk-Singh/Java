//prime number and prime number in a range
import java.util.*;
class primeInRange
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range start_end: ");
        int s=sc.nextInt();
        int e=sc.nextInt();
        int count=0;
        for(int i = s; i <= e; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                if(i%j==0)
                {
                    count++;
                }
            }
            if(count==2)
            {
                System.out.print(i+" ");
            }
            count=0;
        }
    }
}