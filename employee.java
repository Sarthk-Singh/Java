import java.util.Scanner;
class EmployeeException extends RuntimeException
{
    EmployeeException(String s)
    {
        super(s);
    }
}
class employee
{
    int id;
    String name;
    int deptId;
    employee(int id, String name,int deptId)
    {
        this.id=id;
        this.name=name;
        this.deptId=deptId;
    }
    void checkDetails(int id,String name,int deptId) throws EmployeeException
    {
        if(name.charAt(0)>='A'&&name.charAt(0)<='Z'&&id>=2001&&id<=5001&&deptId>=1&&deptId<=5)
        {
            System.out.println();
        }
        else 
            throw new EmployeeException("Details dont meet the rules");
    }
    void printDetails()
    {
        System.out.println("ID: "+id+"\nName: "+name+"\nDepartment ID: "+deptId);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter emploee id: ");
        int id=sc.nextInt();
        System.out.print("Enter employee name: ");
        String name=sc.next();
        System.out.print("Enter the department id: ");
        int deptId=sc.nextInt();
        employee ob= new employee(id,name,deptId);
        try
        {
            ob.checkDetails(id,name,deptId);
        }
        catch(EmployeeException e)
        {
            System.out.println(e);
        }
        ob.printDetails();
        sc.close();
    }
}