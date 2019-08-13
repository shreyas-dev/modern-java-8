package dev.shreyas.modern.java.part03FunctionalInterfaces;

import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class Chapter09UnaryBinaryOperator {

    // When the input and output type is the same we can use unary operators
    static UnaryOperator<String> unaryOperator = (s)-> s.concat(".dev");

    static BinaryOperator<Integer> binaryOperator = (a,b) -> a*b;

    // Using MinBy and MaxBy present in BinaryOperator
    // It Requires a comparator
    static Comparator<Integer> comparator = Integer::compareTo;

    public static void main(String[] args) {
        System.out.println(unaryOperator.apply("shreyas"));
        System.out.println(binaryOperator.apply(3,4));
        System.out.println(BinaryOperator.maxBy(comparator).apply(4,5));
        System.out.println(BinaryOperator.minBy(comparator).apply(4,5));
    }
}
