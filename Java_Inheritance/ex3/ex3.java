package Java_Inheritance.ex3;

public class ex3 {
    public static void main(String[] args) {
        //Shape shape = new Shape();
        Rectangle rectangle = new Rectangle(6.0, 2.0);
        //shape.getArea();

        double area = rectangle.getArea();
        System.out.println("The Area of Rectangle is: " + area);
    }
}
