package dev.shreyas.modern.java.part05Streams;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Chapter12OfIterateAndGenerate {
    // of -> Stream.of() creates a stream of values passed in to this function

    // iterate and generate -> used to create infinite streams
    // generate() takes a supplier as an args
    // iterate takes a seed and expression as parameters
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("https","://","www.","shreyas",".dev");
        stringStream.forEach(System.out::print);
        System.out.println();
        Stream.iterate(1,x->x+1)
                .limit(10)
                .forEach(System.out::print);

        Supplier<Integer> supplier = () -> new Random().nextInt();
        Stream.generate(supplier)
                .limit(10)
                .forEach(System.out::println);
    }
}
