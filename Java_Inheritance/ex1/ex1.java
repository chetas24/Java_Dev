package Java_Inheritance.ex1;


// This a classic Example of Method Overriding
public class ex1 {
    public static void main(String[] args){
        Animal animal = new Animal();
        // created this objects to call out the methods and variable from the class
        Cat cat = new Cat();
        animal.makeSound();
        cat.makeSound();
    }
}
