package dev.shreyas.modern.java.part06NumericStreams;


import java.util.function.Function;
import java.util.stream.IntStream;

public class Chapter01NumericStreams {
    public static void main(String[] args) {
        // Intstream is a stream utility for used for Integers
        // which has a lot of functions built in.
        // Two examples being:
        // 1) rangeClosed(start,end) -> returns a stream of natural numbers from start to end.
        // 2) sum() -> performs a summation of all the integer elements present in the stream.
        Function<Integer,Integer> nSummations =  (n) -> IntStream.rangeClosed(1,n).sum();
        System.out.println("Sum of First 5 natural numbers:"+ nSummations.apply(5));
    }
}
