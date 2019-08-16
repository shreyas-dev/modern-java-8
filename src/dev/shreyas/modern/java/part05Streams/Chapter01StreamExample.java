package dev.shreyas.modern.java.part05Streams;

import dev.shreyas.modern.java.data.Student;
import dev.shreyas.modern.java.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Chapter01StreamExample {
    public static void main(String[] args) {
        // Get all students with name and activities in a map

        Map<String, List<String>> map=StudentDataBase.getAllStudents().stream()
                .collect(Collectors.toMap(Student::getName,Student::getActivities));

        System.out.println(map);
        // Get all Students with gpa > 3.9 , Using Lambdas with stream

        Map<String,List<String>> lambdas = StudentDataBase.getAllStudents()
                .stream()
                // Using Predicate here
                // Declarative way.
                .filter((student -> student.getGpa()>=3.9))
                // Collect method is the one which starts the stream pipeline
                .collect(Collectors.toMap(Student::getName,Student::getActivities));

        // Unless terminal Operators are invoke , streams are not processed.
        // Below sets of command are ignored as terminal operator is not called
        StudentDataBase.getAllStudents()
                .stream()
                .filter((student -> {
                    System.out.println(student);
                    return student.getGpa()>=3.9;
                }));

//        System.out.println(lambdas);
    }
}
