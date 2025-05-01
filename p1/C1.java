package p1; // Declaring the package

import p1.p2.C2; // Importing class C2 from package p1.p2

public class C1
{
    public static void main(String[] args) 
    {
        C2 obj = new C2(); // Creating an object of C2
        int sum = obj.sum(10, 20); // Calling the sum function
        int subtract=C2.sub(20,10);
        System.out.println("Sum: " + sum);
        System.out.println("Subtract: "+subtract);
    }
}
