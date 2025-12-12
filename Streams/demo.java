package Streams;

class Example{
    int add(int a, int b)
    {
        return a + b;
    }
    
    double add(double a, double b)
    {
        return a + b;
    }

}

public class demo {
    public static void main(String[] args) {
        Example obj = new Example();
        System.out.println(obj.add(4, 5));
        System.out.println(obj.add(2.5, 4.5));
    }
}
