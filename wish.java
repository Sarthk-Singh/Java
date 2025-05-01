/* 
write a class displayWish
having void wish(String name)-that wishes hello to given string name
between printing and hello and the provided string name, apply a deplay of 500 ms
suppose multile threads are there and they are trying to access this wish method on the same object, irregular output will be there
so that output becomes regular
*/
class DisplayWish 
{
    static synchronized void wish(String name) 
    {
        System.out.print("Hello ");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
        System.out.println(name);
    }
}

// Thread class that calls the wish method
class MyThread extends Thread 
{
    DisplayWish dw;
    String name;

    MyThread(DisplayWish dw, String name) {
        this.dw = dw;
        this.name = name;
    }

    public void run() 
    {
        dw.wish(name);
    }
}

// Main class to test it all
public class wish
{
    public static void main(String[] args) 
    {
        DisplayWish dw = new DisplayWish(); // only one object

        // Two threads using same DisplayWish object
        MyThread t1 = new MyThread(dw, "V");
        MyThread t2 = new MyThread(dw, "A");
        MyThread t3 = new MyThread(dw, "Sam");
        MyThread t4 = new MyThread(dw, "Amit");
        MyThread t5 = new MyThread(dw, "Bikko");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}
