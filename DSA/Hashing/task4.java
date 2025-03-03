package DSA.Hashing;
//Observe Resizing in HashMap

import java.util.HashMap;

public class task4 {
    public static void main(String[] args) {
        HashMap<Integer, String> mp = new HashMap<>(4, 0.75f); 

        System.out.println("Size: " + mp.size());
        mp.put(1, "One");
        mp.put(2, "Two");
        mp.put(3, "Three");
        mp.put(4, "Four");
        mp.put(5, "Five");

        System.out.println(mp);
        System.out.println("Size: " + mp.size());
    }
}
