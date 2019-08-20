package dev.shreyas.modern.java.part08ParallelStreams;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class Chapter01ParellelStreamPerformance {
    private static int sumTill;
    private static long checkPerformance(Supplier<Integer> sumSupplier,int n){
        long startTime=System.currentTimeMillis();
        for(int i=0;i<n;i++){
            sumSupplier.get();
        }
        long endTime=System.currentTimeMillis();
        return endTime-startTime;
    }

    private static int intStreamSumSequential(){
        return IntStream.rangeClosed(0,sumTill)
                .sum();
    }
    private static int intStreamSumParallel(){
        return IntStream.rangeClosed(0,sumTill)
                .parallel()
                // If there are n cores , the stream is spitted into n streams to
                // make full optimization of all the cores.
                .sum();
    }
    public static void main(String[] args) {
        sumTill = 10000000;
        System.out.println("Time taken by sequential approach:"+checkPerformance(Chapter01ParellelStreamPerformance::intStreamSumSequential,20));
        System.out.println("Time taken by parallel approach:"+checkPerformance(Chapter01ParellelStreamPerformance::intStreamSumParallel,20));
    }
}
