package dev.shreyas.modern.java.part05Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Chapter11FindFirstAndAny {
    //findFirst -> Even in parallel stream, first element in the stream which satisfies the condition
    // findAny -> returns the first element encountered in the stream which satisfies the condition.
    // findAny -> In parrallel stream results maybe difference. Not strictly the first element in the stream but
    // primarily first element encountered.


    // Find First Example
    private static Optional<Integer> findFirstOdd(List<Integer> integers) {
        return integers.stream().filter((i)->i%2!=0).findFirst();
    }

    // FindAny Example
    private static Optional<Integer> findAnyEven(List<Integer> integers) {
        return integers.parallelStream().filter((i)->i%2==0).findAny();
    }
    public static void main(String[] args) {
        System.out.println("Find First Odd:"+findFirstOdd(Arrays.asList(2,3,5,3,4,6,2,8)).get());
        System.out.println("Find Any Even:"+findAnyEven(Arrays.asList(1,3,5,3,4,6,2,8)).get());
    }
}
