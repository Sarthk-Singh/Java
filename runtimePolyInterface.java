//runtime polymorphism using interface
interface Shape 
{
    void draw();  // Method 1
    void area();  // Method 2
}

class Circle implements Shape 
{
    public void draw() 
    {
        System.out.println("Drawing a Circle");
    }

    public void area() 
    {
        System.out.println("Circle Area = π × r²");
    }
}

class Rectangle implements Shape 
{
    public void draw() 
    {
        System.out.println("Drawing a Rectangle");
    }

    public void area() 
    {
        System.out.println("Rectangle Area = length × width");
    }
}

public class runtimePolyInterface 
{
    public static void main(String[] args) {
        Shape myShape;

        myShape = new Circle();
        myShape.draw();  // Output: Drawing a Circle
        myShape.area();  // Output: Circle Area = π × r²

        myShape = new Rectangle();
        myShape.draw();  // Output: Drawing a Rectangle
        myShape.area();  // Output: Rectangle Area = length × width
    }
}
