package dev.shreyas.modern.java.part03FunctionalInterfaces;

import java.util.function.Predicate;

public class Chapter04PredicateExample {
    /*
        Check integer is even
     */

    // Return is not needed as it's a single statement
    private static Predicate<Integer> isEven = (i)-> (i%2)==0;
    private static Predicate<Integer> isPrime = (i) ->{
        int j=2;
        while(j<=Math.sqrt(i)){
            if(i%j==0)
                return false;
            j++;
        }
        return true;
    };

    public static void main(String[] args) {
        System.out.println(isEven.test(4));
        System.out.println(isEven.and(isPrime).test(4)); //predicate chaining with And
        System.out.println(isEven.or(isPrime).test(4)); //predicate chaining with Or
        System.out.println(isEven.and(isPrime.negate()).test(4)); //predicate chaining with negate, 4 is not prime so negate will be true
    }
}
