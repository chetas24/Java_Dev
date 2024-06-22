package Java_Abstraction.ex2;

public class ex2 {
    public static void main(String[] args) {
        double r = 4.0;
        Shape shape1 = new Circle(r);
        double ts1 = 3.0, ts2 = 4.0, ts3 = 5.0;
        Shape shape2 = new Triangle(ts1, ts2, ts3);
        System.out.println("Radius of the Circle: " + r);
        System.out.println("Area of Circle: " + shape1.calculateArea());
        System.out.println("Perimeter of Circle: " + shape1.calculatePerimeter());

        System.out.println("Sides of Triangle: " + ts1 + ',' + ts2 + ',' + ts3);
        System.out.println("Area of Triangle: " + shape2.calculateArea());
        System.out.println("Perimeter of Triangle: " + shape2.calculatePerimeter());
    }
}
