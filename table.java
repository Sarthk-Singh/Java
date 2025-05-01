
class table
{
    public static synchronized void ptable(int x)
    {
        System.out.println("Table of "+x);
        for(int i=1;i<6;i++)
        {
            System.out.println(x+" * "+i+" = "+(x*i));
        }
        // try{
        //     Thread.sleep(1000);
        // }
        // catch(Exception e)
        // {
        //     System.out.println(e);
        // }
    }
}
class myThread extends Thread
{
    table t;
    int num;
    myThread(table t,int num)
    {
        this.t=t;
        this.num=num;
    }
    public void run()
    {
        t.ptable(num);
    }
}
class syncTable
{
    public static void main(String args[])
    {
        table tt1=new table();
        table tt2=new table();

        myThread t1=new myThread(tt1,2);
        myThread t2=new myThread(tt1,5);
        myThread t3=new myThread(tt2, 10);
        myThread t4=new myThread(tt2, 100);

        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}