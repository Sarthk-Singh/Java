//producer consumer problem
import java.util.*;
class PC
{
    LinkedList<Integer>list=new LinkedList<>();
    int capacity=2;
    public void producer() throws Exception
    {
        int value=0;
        while(true)
        {
            synchronized(this)
            {
                if(list.size()==capacity)
                {
                    wait();
                }
                System.out.println("Producer is producing: "+value);
                list.add(value++);
                notify();
                Thread.sleep(1000);
            }
        }
    }
    public void consumer() throws Exception
    {
        while(true)
        {
            synchronized(this)
            {
                if(list.size()==0)
                {
                    wait();
                }
                System.out.println("Consumer consumed "+list.removeFirst());
                Thread.sleep(1000);
                notify();
            }
        }
    }
}
class A extends Thread
{
    PC p;
    public A(PC p)
    {
        this.p=p;
    }
    public void run()
    {
        try
        {
            p.producer();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
class B extends Thread
{
    PC p;
    public B(PC p)
    {
        this.p=p;
    }
    public void run()
    {
        try
        {
            p.consumer();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
public class ProducerConsumerProblem 
{
    public static void main(String[] args) 
    {
        PC p=new PC();
        A t1=new A(p);
        B t2=new B(p);

        t1.start();
        t2.start();
    }
}