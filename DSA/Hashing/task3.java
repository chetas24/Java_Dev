package DSA.Hashing;
// How Java Stores HashMap Entries

import java.util.HashMap;
import java.util.Map;

public class task3 {
    public static void main(String[] args) {
        Map<String, Integer> mp = new HashMap<>();
        mp.put("FB", 1);
        mp.put("Ea", 2);
        
        
        System.out.println("FB Hash: " + "FB".hashCode());
        System.out.println("Ea Hash: " + "Ea".hashCode());

        System.out.println("Value of FB: " + mp.get("FB"));
        System.out.println("Value of Ea: " + mp.get("Ea"));
    }
    /*Since both "FB" and "Ea" have the same hash, Java should store them in the same bucket.
Yet, Java still differentiates the values. How? 🤔
Answer - Java checks the actual key using .equals() before storing or retrieving a value. */
}
