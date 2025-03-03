package Streams;

import java.util.*;
import java.util.stream.*;

public class StreamBasics {
    public static void main(String[] args) {
        // 1. Creating a Stream from a List
        List<String> fruits = Arrays.asList("Apple", "Banana", "Cherry");
        Stream<String> fruitStream = fruits.stream();
        fruitStream.forEach(System.out::println);

        // 2. Creating a Stream from an Array
        String[] colors = {"Red", "Green", "Blue"};
        Stream<String> colorStream = Arrays.stream(colors);
        colorStream.forEach(System.out::println);

        // 3. Creating a Stream using Stream.of()
        Stream<Integer> numberStream = Stream.of(10, 20, 30, 40, 50);
        numberStream.forEach(System.out::println);

        // 4. Creating an Empty Stream
        Stream<String> emptyStream = Stream.empty();
        System.out.println("Empty Stream Created");

        // 5. Creating an Infinite Stream (Limited)
        Stream<Double> randomNumbers = Stream.generate(Math::random).limit(5);
        randomNumbers.forEach(System.out::println);
    }
}
