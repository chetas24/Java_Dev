package DSA.Array.Operations.Insertion;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("A");
        arr.add("C");
        arr.add("E");

        arr.add(1, "B");
        arr.add(3, "D");

        System.out.println(arr);
    }
}
