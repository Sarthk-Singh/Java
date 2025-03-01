import java.util.*;

class saddlePoint
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of n*n matrix: ");
        int n=sc.nextInt();
        int flag=0;
        int arr[][]=new int[n][n];
        for (int i = 0; i < n; i++) 
        {
            for(int j = 0; j < n; j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        for(int r = 0; r < n; r++)
        {
            int c = 0,min=arr[r][c];
            for(int i = 0; i < n; i++)
            {
                if(min>arr[r][i])
                {
                    min=arr[r][i];
                    c=i;
                }
            }
            int max=0;
            for(int j = 0; j < n; j++)
            {
                if(max<arr[j][c])
                {
                    max=arr[j][c];
                }
            }
            if(max==min)
            {
                System.out.print("Saddle point: "+min);
                flag=1;
            }
        }
        if(flag==0)
        {
            System.out.println("NO SADDLE POINT FOUND...");
        }
        sc.close();
    }
}
