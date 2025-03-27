//voting
import java.util.*;
class voting
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of voters: ");
        int n=sc.nextInt();
        int voters[]=new int[n];
        int count[]=new int[6];
        
        System.out.println("You can vote in the range 1-5");
        for(int i=0;i<n;i++)
        {
            voters[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(voters[i]>=1 &&voters[i]<=5)
                count[voters[i]]++;
            else
                count[0]++;
        }
        System.out.println("NOTA: "+count[0]);
        for(int i=1;i<=5;i++)
        {
            System.out.println("Candidate "+i+" got "+count[i]+" votes");
        }
        sc.close();
    }
}
