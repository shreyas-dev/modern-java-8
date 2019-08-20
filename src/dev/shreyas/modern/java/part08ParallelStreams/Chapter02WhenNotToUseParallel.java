package dev.shreyas.modern.java.part08ParallelStreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.Arrays.asList;

public class Chapter02WhenNotToUseParallel {
    private static void calculateSumOfList(List<Integer> integers){
        long startTime = System.currentTimeMillis();
        integers.stream()
                .reduce(0, Integer::sum);
        long endTime = System.currentTimeMillis();
        System.out.println("Sequential Time taken is:   "+(endTime-startTime));
    }
    private static void calculateSumOfListParallely(List<Integer> integers){
        long startTime = System.currentTimeMillis();
        integers.stream()
                .parallel()
                .reduce(0, Integer::sum); // Boxing has to happen from Integer to int
        long endTime = System.currentTimeMillis();
        System.out.println("Parallel Time taken is: "+(endTime-startTime));
    }

    public static void main(String[] args) {
        List<Integer> integers = IntStream.rangeClosed(1,1000000)
                .boxed()
                .collect(Collectors.toList());
        calculateSumOfList(integers);
        calculateSumOfListParallely(integers);

    }
}
