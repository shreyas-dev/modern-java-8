package dev.shreyas.modern.java.part09Optional;

import dev.shreyas.modern.java.data.Student;
import dev.shreyas.modern.java.data.StudentDataBase;

import java.util.Optional;

public class Chapter01OptionalExample {
    // Optional is used for null values
    // Optional is used to avoid NullPointerException and NullChecks
    public static void getStudentNameOptional(){
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        //checks if the value is null or not
        studentOptional.ifPresent(System.out::println);
    }

    public static void main(String[] args) {
        getStudentNameOptional();
    }
}
