import java.util.*;
class LowBalanceException extends RuntimeException
{
    LowBalanceException(String s)
    {
        super(s);
    }
}

class bankBalanceException
{
    int accNo;
    String name;
    double balance;
    bankBalanceException(int accNo,String name,double balance)
    {
        this.accNo=accNo;
        this.name=name;
        this.balance=balance;
    }
    void deposite(double dp)
    {
        balance+=dp;
    }
    void withdraw(double wd)
    {
        if(wd>balance)
            throw new LowBalanceException("Low account balance!!");
        else
            balance-=wd;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter account number: ");
        int accNo=sc.nextInt();
        System.out.print("Enter name: ");
        String name=sc.next();
        System.out.print("Enter balance: ");
        double balance=sc.nextDouble();
        bankBalanceException ob=new bankBalanceException(accNo,name,balance);
        boolean in=true;
        while(in)
        {
            System.out.println("Enter 1 to deposite\n2 to withdraw\n3 to exit");
            int input=sc.nextInt();
            switch (input) {
                case 1:
                    System.out.print("Enter amount to deposite: ");
                    double dp=sc.nextDouble();
                    ob.deposite(dp);
                    System.out.println("Balance: "+ob.balance);
                    break;
                case 2:
                    try
                    {
                        System.out.print("Enter amount to withdraw: ");
                        double wd=sc.nextDouble();
                        ob.withdraw(wd);
                    }
                    catch(LowBalanceException e)
                    {
                        System.out.println(e);
                    }
                    System.out.println("Balance: "+ob.balance);
                    break;
                case 3:
                    in=false;
                    break;
                default:
                    System.out.println("Invalid input...Try again!");
                    break;
            }
        }
        
        sc.close();
    }
}