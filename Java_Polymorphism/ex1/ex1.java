package Java_Polymorphism.ex1;

public class ex1 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Bird bird = new Bird();
        Cat cat = new Cat();

        animal.sound();
        bird.sound();
        cat.sound();
    }
}
