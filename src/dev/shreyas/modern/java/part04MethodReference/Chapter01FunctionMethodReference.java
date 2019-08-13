package dev.shreyas.modern.java.part04MethodReference;

import java.util.function.Function;

public class Chapter01FunctionMethodReference {
    static Function<String,String> toUpperCase=(s)->s.toUpperCase();
    // Method Reference
    // ClassName::instance-methodName
    // ClassName::static-methodName
    // Instance::methodName
    static Function<String,String> toUpperCaseWithMethodReference=String::toUpperCase;
    public static void main(String[] args) {
        System.out.println(toUpperCaseWithMethodReference.apply("shreyas.dev"));
        System.out.println(toUpperCase.apply("shreyas.dev"));
    }
}
