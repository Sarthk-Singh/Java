import java.util.*;
interface i1
{
    public void displayVolume();
}
class cone implements i1
{
    double radius, height;
    cone(double radius,double height)
    {
        this.radius=radius;
        this.height=height;
    }
    public void displayVolume()
    {
        double vol = (1.0 / 3) * 3.14 * radius * radius * height;
        System.out.println("Volume of Cone: "+vol);
    }
}
class hemisphere implements i1
{
    double radius;  
    hemisphere(double radius)
    {
        this.radius=radius;
    }
    public void displayVolume()
    {
        double vol = (2.0 / 3) * 3.14 * radius * radius * radius;
        System.out.println("Volume of Hemisphere: "+vol);
    }
}
class cylinder implements i1
{
    double radius,height;
    cylinder(double radius,double height)
    {
        this.radius=radius;
        this.height=height;
    }
    public void displayVolume()
    {
        double vol=3.14*radius*radius*height;
        System.out.println("Volume of Cylinder: "+vol);
    }
}
class volume
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Cone");
        System.out.println("2. Hemisphere");
        System.out.println("3. Cylinder");
        System.out.println("4. Exit");
        boolean input=true;
        i1 t;
        while (input)
        {
            System.out.println("Enter your choice:");
            int ch = sc.nextInt();
            switch (ch)
            {
                case 1:
                    System.out.print("Enter the radius and height of cone: ");
                    double r1=sc.nextDouble();
                    double h1=sc.nextDouble();
                    t = new cone(r1,h1);
                    t.displayVolume();
                    break;
                case 2:
                    System.out.print("Enter the radius of hemisphere: ");
                    double r2=sc.nextDouble();
                    t = new hemisphere(r2);
                    t.displayVolume();
                    break;
                case 3:
                    System.out.print("Enter the radius and height of cylinder: ");
                    double r3=sc.nextDouble();
                    double h3=sc.nextDouble();
                    t= new cylinder(r3,h3);
                    t.displayVolume();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    input = false;
                    break;
                default:
                    System.out.println("Invalid choice...Try again!");
            }
        }
        sc.close();
    }
}
