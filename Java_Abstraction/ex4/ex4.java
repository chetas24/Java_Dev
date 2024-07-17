package Java_Abstraction.ex4;

public class ex4 {
    public static void main(String[] args) {
        Person athlete = new Athlete();
        Person lazyPerson = new LazyPerson();
        athlete.eat();
        athlete.exercise();
        lazyPerson.eat();
        lazyPerson.exercise();
    }
}
