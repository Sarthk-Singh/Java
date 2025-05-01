import java.util.*;
public class q6 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of an Array: ");
        int n = sc.nextInt();

        int array[] = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        int left = 0, right = 0;
        while (right < n) {
            if (array[right] < 0) {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
                left++;
            }
            right++;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        sc.close();
    }
}
