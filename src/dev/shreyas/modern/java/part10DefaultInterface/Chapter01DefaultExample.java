package dev.shreyas.modern.java.part10DefaultInterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Chapter01DefaultExample {

    // default keyword is used to identify a default method in an interface

    // Interface can have default methods and static method
    // only difference between static and default is that
    // static method can't be overridden and default method can be overridden
    // default method provides implementation to interface
    public static void main(String[] args) {
        // Sort list into alphabetical order
        List<String> strings = Arrays.asList("Adam","Jenny","Alex","Dan","Mike","Eric");
        // Prior to Java 8
        Collections.sort(strings);
        System.out.println(strings);

        // Java 8 way
        // sort is a default method which has implementation
        // even if list is an interface
        strings.sort(Comparator.naturalOrder());
        System.out.println(strings);

        // reverse order
        strings.sort(Comparator.reverseOrder());
        System.out.println(strings);
    }

}
