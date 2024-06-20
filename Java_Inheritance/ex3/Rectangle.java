package Java_Inheritance.ex3;

public class Rectangle extends Shape{

    private double length;
    private double width;

    // Constructor takes no return type, not even Void
    public Rectangle (double length, double width)
    {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea()
    {
        return length * width;
    }
}
