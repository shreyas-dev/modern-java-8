package dev.shreyas.modern.java.part03FunctionalInterfaces;

import java.util.function.Consumer;

public class Chapter01ConsumerInterface {

    /*
            @FunctionalInterface Annotation
            @FunctionalInterface annotation is used to ensure that the functional interface
            can’t have more than one abstract method. In case more than one abstract methods
            are present, the compiler flags an ‘Unexpected @FunctionalInterface annotation’ message.
            However, it is not mandatory to use this annotation.

            Link: https://www.geeksforgeeks.org/functional-interfaces-java/
     */

    /*
        Consumer -> Accept an input and perform some operation on that input
        Consumer only accepts and returns void
     */

    public static void main(String[] args) {

        // This consumer will convert the string s to uppercase
        Consumer<String> convertToUpperCase = (s)->System.out.println(s.toUpperCase());

        // We provide the string to the consumer using accept method
        convertToUpperCase.accept("modern-java-8");

    }
}
