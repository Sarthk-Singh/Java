import java.util.*;
abstract class shape
{
    abstract void rectangle(int l,int b);

    abstract void circle(int r);
    
    abstract void square(int s);
}
class area extends shape
{
    void rectangle(int l,int b)
    {
        System.out.println("Area of rectangle: "+l*b);
    }
    void circle(int r)
    {
        System.out.println("Area of circle: "+3.14*r*r);
    }
    void square(int s)
    {
        System.out.println("Area of square: "+s*s);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        area ob=new area();
        System.out.print("Enter the length and breadth of rectangle: ");
        int l=sc.nextInt();
        int b=sc.nextInt();
        ob.rectangle(l,b);
        System.out.print("Enter the radius of circle: ");
        int r=sc.nextInt();
        ob.circle(r);
        System.out.print("Enter the side of square: ");
        int s=sc.nextInt();
        ob.square(s);
    }
}