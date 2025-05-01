//make transaction =s in bank account and show final balance in the end
class myBank
{
    double balance;
    myBank(double balance)
    {
        this.balance=balance;
    }
    public synchronized void deposite(double amount)
    {
        balance+=amount;
        System.out.println("Amount "+amount+" deposited to your account");
        System.out.println("New balance: "+balance);
    }
    public synchronized void withdraw(double amount)
    {
        if(amount<=balance)
        {
            balance-=amount;
            System.out.println("Amount "+amount+" withdrawn from your account");
            System.out.println("New balance: "+balance);
        }
        else
            System.out.println("Low balance!");
    }
    public double getBalance()
    {
        return balance;
    }
}

class myTransaction extends Thread
{
    private double amount;
    private myBank account;
    private boolean flag;   //true deposite false withdraw

    public myTransaction(double amount,myBank account,boolean flag)
    {
        this.amount=amount;
        this.account=account;
        this.flag=flag;
    }
    public void run()
    {
        if(flag)
            account.deposite(amount);
        else
            account.withdraw(amount);
        
    }
}
class BankTransactions
{
    public static void main(String args[]) throws InterruptedException
    {
        myBank ob=new myBank(1000);

        myTransaction t1=new myTransaction(500,ob,true);
        myTransaction t2=new myTransaction(100,ob,false);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        double finalBalance=ob.getBalance();
        System.out.println("\nFinal bank Balance: "+finalBalance+"\n");
    }
}