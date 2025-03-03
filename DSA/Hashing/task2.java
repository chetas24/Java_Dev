package DSA.Hashing;
//Find two different strings that produce the same hashCode() in Java.

public class task2 {
    public static void main(String[] args) {
        String a = "FB";
        String b = "Ea";

        System.out.println("Hash Value of FB: " + a.hashCode());
        System.out.println("Hash Value of Ea: " + b.hashCode());
        // produces same hash that means collision has occur
    }    
}
