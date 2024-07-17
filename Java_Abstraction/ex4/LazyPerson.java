package Java_Abstraction.ex4;

public class LazyPerson extends Person{
    @Override
    public void eat()
    {
        System.out.println("LazyPerson: Eats UnHealthy Food");
    }

    @Override
    public void exercise()
    {
        System.out.println("Doesn't Exercise Daily");
    }
}
