package Java_Encapsulation.ex1;

public class ex1 {
    public static void main(String[] args) {
        Person p1 = new Person("abc", 20, "India");
        Person p2 = new Person("xyz", 24, "America");
        Person p3 = new Person(null, 0, null);
        p3.setName("efg");
        p3.setAge(23);
        p3.setCountry("India");

        System.out.println("Person 1 name, age and country: " + p1.getName() + ", " + p1.getAge() + ", " + p1.getCountry());
        System.out.println("Person 2 name, age and country: " + p2.getName() + ", " + p2.getAge() + ", " + p2.getCountry());
        System.out.println("Person 3 name, age and country: " + p3.getName() + ", " + p3.getAge() + ", " + p3.getCountry());

    }
}
