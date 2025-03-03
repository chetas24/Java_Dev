
//Write a Java method that takes a string as input and
//returns its hash value (using Java’s built-in hash function)

package DSA.Hashing;

public class task1 {

    public static void main(String[] args) {
        String a = "Mango";
        String b = "Banana";

        System.out.println("Hash Value of Mango: " + a.hashCode());
        System.out.println("Hash Value of Banana: " + b.hashCode());
    }
}