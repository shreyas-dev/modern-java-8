package dev.shreyas.modern.java.part01ImperativeVsDeclarative;

import java.util.stream.IntStream;

public class Chapter01ImperativeVsDeclarative {
    public static void main(String[] args) {

        /*
         * Problem: Calculate sum of from 0 to 100 numbers
         */
        /*
         *  Imperative - how style of programming
         */


        // We are mutating a variable in order to get the result
        // Running this in a multiple threaded environment, will get
        // you in lot of problems and unacceptable result.
        // You need to go line by line to understand the code.
        int sum=0;
        for(int i=0;i<=100;i++){
            sum+=i;
        }
        System.out.println("Sum for first 100 numbers using Imperative Programmming:"+sum);

        /*
         * Declarative  - what kind of programming
         *
         * Meaning u ask for what do u want
         */

        // summation happens behind the scenes
        // this will run this code in multiple threaded env
        int sum1=IntStream.rangeClosed(0,100)
                .parallel()     // parallel function splits the values
                .sum();
        System.out.println("Sum for first 100 numbers using Declarative Programmming:"+sum1);


    }
}
