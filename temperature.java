import java.util.*;
abstract class tempcf
{
    double temp;
    void setTempData(double temp)
    {
        this.temp=temp;
    }
    abstract void changeTemp();
}
class celcious extends tempcf
{
    double ctemp;
    void changeTemp()
    {
        ctemp = (5.0 / 9) * (temp - 32);
        System.out.println("Temperature in C: "+ctemp);
    }
}
class fahrenheit extends tempcf
{
    double ftemp;
    void changeTemp()
    {
        ftemp = (9.0 / 5) * temp + 32;  
        System.out.println("Temperature in F: "+ftemp);
    }
}
class temperature
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        tempcf t1;

        System.out.println("Press 1 to convert from F to C\nPress 2 to convert from C to F");
        int option=sc.nextInt();
        switch(option)
        {
            case 1:
                t1=new celcious();
                System.out.println("Enter temperature in F:");
                t1.setTempData(sc.nextDouble());
                t1.changeTemp();
                break;
            case 2:
                t1=new fahrenheit();
                System.out.println("Enter temperature in C:");
                t1.setTempData(sc.nextDouble());
                t1.changeTemp();
                break;
            default:
                System.out.println("Invalid option");
        }
        
        sc.close();
    }
}