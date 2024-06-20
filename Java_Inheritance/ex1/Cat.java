package Java_Inheritance.ex1;


// extends inherits attributes and methods from superclass 
// This is Subclass
public class Cat extends Animal{
    // When the methods of Subclass overrides the method of Superclass, this is known as Method Overriding. 
    // We used @override annotation to provide information(metadata) to the compiler
    // This annotation specifies that the method created after this annotation overrides the method of Superclass.
    @Override
    public void makeSound()
    {
        System.out.println("The Cat Quarrels");
    }
}