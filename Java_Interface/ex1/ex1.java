package Java_Interface.ex1;

public class ex1 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 12);
        Circle circle = new Circle(3);
        Triangle triangle = new Triangle(4, 6, 8);

        System.out.println("Area of Rectangle: " + rectangle.getArea());
        System.out.println("Area of Circle: " + circle.getArea());
        System.out.println("Area of Triangle: " + triangle.getArea());
    }
}
