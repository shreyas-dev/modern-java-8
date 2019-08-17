package dev.shreyas.modern.java.part06NumericStreams;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Chapter02IntStreamExample {
    public static void main(String[] args) {
        // 1) range(start,end) -> returns a stream of natural numbers from start to end-1.
        // 2) rangeClosed(start,end) -> returns a stream of natural numbers from start to end.
        System.out.println("Count of elements in Range Stream from 1 to 50 is: "+IntStream.range(1,50).count()); // 50 is not in the stream
        System.out.println("Count of elements in Range Closed Stream from 1 to 50 is: "+IntStream.rangeClosed(1,50).count()); // 50 is included
        System.out.println("Same Rule for Long Stream: "+IntStream.rangeClosed(1,50).count()); // 50 is included

        // If u want doubleStream , since doubleStream has no ranges
        // average() -> returns the average value of all the elements in the stream
        System.out.println(IntStream.rangeClosed(1,49).asDoubleStream().average().getAsDouble());
        System.out.println(LongStream.rangeClosed(50,100).asDoubleStream().average().getAsDouble());


        // Aggregate Functions
        // 1) sum()
        // 2) max()
        // 3) min()
        // 4) average()

        System.out.println("Max value between pie for 3.1151 is: " + DoubleStream.of(22d/7d,3.1151).max().getAsDouble());
        System.out.println("Min value between pie for 3.14251 is: " + DoubleStream.of(22d/7d,3.14251).min().getAsDouble());


    }
}
