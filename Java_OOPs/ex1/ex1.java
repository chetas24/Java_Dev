package Java_OOPs.ex1;

public class ex1 {
    public static void main(String[] args) {
        Person p1 = new Person("xyz", 20);
        Person p2 = new Person("abc", 50);

        System.out.println("Name: " + p1.getName());
        System.out.println("Age: " + p1.getAge());
        System.out.println("Name: " + p2.getName());
        System.out.println("Age: " + p2.getAge());
    }
}
