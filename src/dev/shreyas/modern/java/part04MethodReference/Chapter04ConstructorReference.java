package dev.shreyas.modern.java.part04MethodReference;

import dev.shreyas.modern.java.data.Student;

import java.util.function.Function;
import java.util.function.Supplier;

public class Chapter04ConstructorReference {

    // U can call a constructor using method reference new keyword


    // Here since function takes in one args, compiler is expecting a
    // One arg constructor
    static Function<String, Student> studentFunction = Student::new;


    // Supplier has no args hence empty constructor is called.
    static Supplier<Student> studentSupplier = Student::new;
    public static void main(String[] args) {
        System.out.println(studentFunction.apply("shreyas"));
    }
}
