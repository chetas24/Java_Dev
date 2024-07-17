package Java_Abstraction.ex4;

public class Athlete extends Person{
    @Override
    public void eat()
    {
        System.out.println("Athlete: Eats Healthy Food");
    }

    @Override
    public void exercise()
    {
        System.out.println("Exercise Daily");
    }
}
