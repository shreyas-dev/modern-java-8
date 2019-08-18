package dev.shreyas.modern.java.part07TerminalOperators;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Chapter03SummingIntAndAverageInt {
    //summingDouble,summingLong also present and provides same functionality
    private static int getSum(List<Integer> integerList){
        return integerList.stream().collect(Collectors.summingInt(Integer::intValue));
    }

    //averagingDouble,averagingLong also present and provides same functionality
    private static double getAvg(List<Integer> integerList){
        return integerList.stream().collect(Collectors.averagingInt(Integer::intValue));
    }
    public static void main(String[] args) {
        System.out.println("Sum of elements in arrays are: "+getAvg(Arrays.asList(1,2,3,4)));
        System.out.println("Avg of elements in arrays are: "+getAvg(Arrays.asList(1,2,3,4)));
    }
}
