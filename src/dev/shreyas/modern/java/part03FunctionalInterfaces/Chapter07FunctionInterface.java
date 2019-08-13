package dev.shreyas.modern.java.part03FunctionalInterfaces;

import java.util.function.Function;

public class Chapter07FunctionInterface {
    //    In java , a function is a method in a class.
    //Using function interface we can implement a functionality and assign that functionality to a variable.
    // Function<T,R> where R is the return type.
    static Function<String,String> toUpperCase = (name) -> name.toUpperCase();
    static Function<String,String> addDefault=(name)->name.concat(".dev");
    public static void main(String[] args) {
        System.out.println(toUpperCase.apply("shreyas"));

        // First toUpperCase function will be executed and then addDefault
        // function will be executed
        System.out.println(toUpperCase.andThen(addDefault).apply("shreyas"));

        // Compose is complete opposite of andThen
        System.out.println(toUpperCase.compose(addDefault).apply("shreyas"));
    }
}
