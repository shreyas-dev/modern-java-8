package dev.shreyas.modern.java.part05Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Chapter02StreamsVsCollections {
    public static void main(String[] args) {
        // 1) You can add and modify elements in collections
        // Eg.
        List<String> name = Arrays.asList("shreyas","thejas","ananth");
        // In streams there's no add or modify element method

        // 2) Elements can be accessed in any order in Collection
        // Eg.
        String secondElement=name.get(1);
        // Streams cannot be accessed in any order

        // 3) Collection is not executed until terminal operation
        // We have seen it in the last episode


        // Collection can be traversed n number of times
        Stream<String> nameStream = name.stream();
        nameStream.forEach(System.out::println);
        // Will throw an error as it as always be processed
        nameStream.forEach(System.out::println);

        // We can use external iterations for list.

    }
}
