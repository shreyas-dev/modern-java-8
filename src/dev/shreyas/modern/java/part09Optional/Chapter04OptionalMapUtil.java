package dev.shreyas.modern.java.part09Optional;

import dev.shreyas.modern.java.data.Student;
import dev.shreyas.modern.java.data.StudentDataBase;

import java.util.Optional;

public class Chapter04OptionalMapUtil {
    // map util of optional as few functions which includes
    // filter
    public static void filterExample(){
        Optional.ofNullable(StudentDataBase.studentSupplier.get())
                .filter(student -> student.getGpa()>=3.9)
                .ifPresent(System.out::println);
    }

    //map
    public static void mapExample(){
        Optional.ofNullable(StudentDataBase.studentSupplier.get())
                .map(Student::getName)
                .ifPresent(System.out::println);
    }

    public static void main(String[] args) {
        filterExample();
        mapExample();
    }
}
