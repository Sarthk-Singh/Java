//multi threading in java

class A extends Thread
{
    public void run()
    {
        //String threadName=Thread.currentThread().getName();   //returns name of the curret running name
        for(int i=1;i<=5;i++)
        {
            System.out.println(Thread.currentThread().getName()+"...i="+i);
            // try{
            //     sleep(1000);
            // }
            // catch(InterruptedException e)
            // {
            //     System.out.println(e);
            // }
        }
        System.out.println("Thread A ended...");
    }
}
class B extends Thread
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println(Thread.currentThread().getName()+"...j="+i);
        }
        System.out.println("Thread B ended...");
    }
}
class C extends Thread
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println(Thread.currentThread().getName()+"...k="+i);
        }
        System.out.println("Thread C ended...");
    }
}
class threadingExample
{
    public static void main(String args[])
    {
        A t1=new A();
        B t2=new B();
        C t3=new C();
        
        //getName()
        System.out.println(t1.getName());
        System.out.println(t2.getName());
        System.out.println(t3.getName());
        
        //setName()
        t1.setName("THREAD A");
        System.out.println(t1.getName());
        t2.setName("THREAD B");
        System.out.println(t2.getName());
        t3.setName("THREAD C");
        System.out.println(t3.getName());

        t1.start();
        t2.start();
        t3.start();
        
        //join() and join(ms)
        try{
            t1.join();  //t1.join(1600);    timed waiting   //will proceed if t1 dosent return in 1600ms
            t2.join();
            t3.join();
        }
        catch(InterruptedException e)
        {
            System.out.println("Exception Caught!");
        }

        
        System.out.println("***Remaining Code***");
    }
}