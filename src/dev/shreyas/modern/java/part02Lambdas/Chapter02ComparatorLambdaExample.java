package dev.shreyas.modern.java.part02Lambdas;

import java.util.Comparator;

public class Chapter02ComparatorLambdaExample {
    /*
           @FunctionalInterface
                public interface Comparator<T> {
                    int compare(T o1, T o2);
                }

                Implementing Comparator
     */

    public static void main(String[] args) {
        /*
            Prior java 8
         */
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
                // compare to will return
                // 1) 0 if o1 == o2
                // 2) 1 if o1 is greater than o2
                // 3) -1 if o1 is lesser than o2
            }
        };

        System.out.println("Result of comparator :"+comparator.compare(1,1));
        System.out.println("Result of comparator :"+comparator.compare(1,2));
        System.out.println("Result of comparator :"+comparator.compare(2,1));

        /*
            After Java 8
         */

        // First way
        Comparator<Integer> comparatorLambda = (Integer a,Integer b) -> a.compareTo(b);

        // Second Way
        // Here the compiler is smart enough to guess the parameters are Intger types
        Comparator<Integer> comparatorLambda1 = (a,b) -> a.compareTo(b);

    }

}
