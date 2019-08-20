package dev.shreyas.modern.java.part08ParallelStreams;

import java.util.stream.IntStream;

public class Chapter03MutableParallelExample {
    public static class Sum{
        int total;
        private Sum(){
            total=0;
        }

        private void performSum(int x){
            this.total+=x;
        }
    }
    public static void main(String[] args) {
        Sum sum=new Sum();
        IntStream.range(0,100000).parallel().forEach(sum::performSum);
        System.out.println("Sum of 1st 1000000000 numbers sum is:"+sum.total ); // Actual Answer is 704982704
    }
}
