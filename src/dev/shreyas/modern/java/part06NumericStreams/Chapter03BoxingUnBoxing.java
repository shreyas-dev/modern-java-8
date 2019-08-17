package dev.shreyas.modern.java.part06NumericStreams;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Chapter03BoxingUnBoxing {

    // Boxing -> Converting a Primitive type to Wrapper type. ex: int to Integer
    // UnBoxing -> Converting a Wrapper type to Primitive type. ex: Double to double

    private static List<Integer> boxingIntStreamToInteger(int n){
        return IntStream.range(1,n)
                // stream of type int
                .boxed()
                // now converted to Wrapper Class Integer
                .collect(Collectors.toList());
    }

    private static int unboxingListInteger(List<Integer> integers){
        return integers.stream()
                // map to int with Integer::intValues converts it into
                // Wrapper class to Integer class with IntStream
                .mapToInt(Integer::intValue)
                // From on we can use all Intstream functions.
                .sum();
    }

    public static void main(String[] args) {
        System.out.println("First 10 Integer Summation:"+unboxingListInteger(boxingIntStreamToInteger(10)));
        Function<Integer,List<Integer>> lambdaFuncEx = (Integer n) -> IntStream.range(1,n).boxed().collect(Collectors.toList());
        System.out.println("First 20 Integer Summation:"+unboxingListInteger(lambdaFuncEx.apply(20)));
    }
}
