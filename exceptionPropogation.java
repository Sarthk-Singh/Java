class exceptionPropogation
{
    void m1()
    {
        System.out.println(10/0);
    }
    void m2()
    {
        m1();
    }
    void m3()
    {
        m2();
    }
    public static void main(String args[])
    {
        exceptionPropogation ob=new exceptionPropogation();
        try
        {
            ob.m3();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        ob.m3();
    }
}