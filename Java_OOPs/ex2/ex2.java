package Java_OOPs.ex2;

public class ex2 {
    public static void main(String[] args) {
        Dog d1 = new Dog("John", "Husky");
        System.out.println("Dogs name is: "+ d1.getName() + " and Breed of the Dog is: " + d1.getBreed());
        d1.setName("Hero");
        System.out.println("Dogs name is: "+ d1.getName() + " and Breed of the Dog is: " + d1.getBreed());
    }
}
