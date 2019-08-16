package dev.shreyas.modern.java.part05Streams;

import dev.shreyas.modern.java.data.Student;
import dev.shreyas.modern.java.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class Chapter07FilterExample {
    // Filter function returns a boolean condition which will be removed
    // in the stream if the  elements doesn't satisfy the condition

    public static List<Student> getOnlyMales(){
        return StudentDataBase.getAllStudents()
                .stream()
                .filter((student -> student.getGender().equals("male")))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println("Get Only male students");
        getOnlyMales().forEach((student -> System.out.println(student.getName()+":"+student.getGender())));
    }
}
