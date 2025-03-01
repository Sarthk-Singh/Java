import java.util.*;
class wavy
{
    public void swap(int a,int b)
    {
        int temp=a;
        a=b;
        b=temp;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        wavy ob=new wavy();
        System.out.print("Enter the size of array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter the elements: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++)
        {
            
            if(i%2==0&&arr[i]>arr[i+1])
            {
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
            else if(i%2!=0&&arr[i]<arr[i+1])
            {
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        sc.close();
    }
}