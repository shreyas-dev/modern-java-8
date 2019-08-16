package dev.shreyas.modern.java.part05Streams;

import dev.shreyas.modern.java.data.Student;
import dev.shreyas.modern.java.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class Chapter04FlatMapExample {
    private static List<String> flatMapFunction() {
        return StudentDataBase.getAllStudents().stream() // Stream<Student>
                .map(Student::getActivities)  // Stream<List<String>> , now u can't collect unless u flatten it further
                .flatMap(List::stream)      // Converts the list to string
                .distinct()                    // Will give you distinct results.
                .collect(Collectors.toList());
    }
    public static void main(String[] args) {
        System.out.println(flatMapFunction());
    }
}
