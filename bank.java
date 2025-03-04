import java.util.*;
class bank
{
    String name;
    String address;
    int accno;
    double balance;
    public bank(String name,String address,int accno,double balance)
    {
        this.address=address;
        this.name=name;
        this.accno=accno;
        this.balance=balance;
    }

    void dislay()
    {
        System.out.println("Name : "+name);
        System.out.println("Address : "+address);
        System.out.println("Account Number : "+accno);
        System.out.println("Balance : "+balance);
    }
    void deposite(double dp)
    {
        balance=balance+dp;
    }
    void withdraw(double wd)
    {
        if(balance>=wd)
        {
            balance=balance-wd;
        }
        else
        {
            System.out.println("Insufficient balance");
        }
    }
    void changeAddress(String address)
    {
        this.address=address;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        String name,address;
        double balance;
        int accno;
        System.out.println("*****Bank Management System*****");
        System.out.print("Enter the number of depositors: ");
        int n=sc.nextInt();
        //array of objects
        bank arr[]=new bank[n];
        //input
        for(int i=0;i<n;i++)
        {
            System.out.println("************************************"); 
            System.out.println("Enter the name of depositor "+(i+1)+": ");
            name=sc.next();
            System.out.println("Enter the address of depositor "+(i+1)+": ");
            address=sc.next();
            System.out.println("Enter the balance of depositor "+(i+1)+": ");
            balance=sc.nextDouble();
            accno=1001+i;
            System.out.println("Your account number is: "+accno);
            arr[i]=new bank(name,address,accno,balance);
        }
        int input=1;
        boolean x=true;
        while(x)
        {
            System.out.println("************************************");
            System.out.println("Press 1 to deposite\nPress 2 to withdraw\nPress 3 to print details\nPress 4 to change the address\nPress 5 to exit");
            System.out.println("************************************");
            input=sc.nextInt();
            switch(input)
            {
                case 1:
                    System.out.print("Enter the account number: ");
                    int acc1=sc.nextInt();
                    if(acc1<1000||acc1>(1000+n))
                    {
                        System.out.println("ACCOUNT DOES NOT EXIST...");
                    }
                    else
                    {
                        System.out.print("Enter the amount to deposite: ");
                        double amount1=sc.nextDouble();
                        arr[(acc1-1001)].deposite(amount1);
                        System.out.println("New balance: "+arr[(acc1-1001)].balance);
                    }
                    break;
                case 2:
                    System.out.print("Enter the account number: ");
                    int acc2=sc.nextInt();
                    if(acc2<1000||acc2>(1000+n))
                    {
                        System.out.println("ACCOUNT DOES NOT EXIST...");
                    }
                    else
                    {
                        System.out.print("Enter the amount to withdraw: ");
                        double amount2=sc.nextDouble();
                        arr[(acc2-1001)].withdraw(amount2);
                        System.out.println("New balance: "+arr[(acc2-1001)].balance);
                    }
                    break;
                case 3:
                    System.out.print("Enter the account number: ");
                    int acc3=sc.nextInt();
                    if(acc3<1000||acc3>(1000+n))
                    {
                        System.out.println("ACCOUNT DOES NOT EXIST...");
                    }
                    else
                    {
                        System.out.println("************************************");
                        arr[(acc3-1001)].dislay();
                    }
                    break;
                case 4:
                    System.out.print("Enter the account number: ");
                    int acc4=sc.nextInt();
                    if(acc4<1000||acc4>(1000+n))
                    {
                        System.out.println("ACCOUNT DOES NOT EXIST...");
                    }
                    else
                    {
                        System.out.print("Enter the new address: ");
                        String add=sc.next();
                        arr[(acc4-1001)].changeAddress(add);
                        System.out.println("ADDRESS UPDATED!");
                    }
                case 5:
                    System.out.println("EXITING...");
                    x=false;
                    break;
                default:
                    System.out.println("INVALID INPUT...TRY AGAIN!");
            }
        }
    }
}