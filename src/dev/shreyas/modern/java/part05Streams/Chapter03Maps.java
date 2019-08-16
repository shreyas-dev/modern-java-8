package dev.shreyas.modern.java.part05Streams;

import dev.shreyas.modern.java.data.Student;
import dev.shreyas.modern.java.data.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Chapter03Maps {
    // Maps are used to convert from one type t another.
    private static List<String> getStudentList() {
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)      //Converts it to Stream<String>
                .map(String::toUpperCase)   // Converts the value to uppercase but does not change the data structure
                .collect(Collectors.toList());
    }

    private static Set<String> getStudentSet() {
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)      //Converts it to Stream<String>
                .map(String::toUpperCase)   // Converts the value to uppercase but does not change the data structure
                .collect(Collectors.toSet());
    }
    public static void main(String[] args) {
        System.out.println(getStudentList());
        System.out.println(getStudentSet());
    }
}
