package dev.shreyas.modern.java.part05Streams;

import dev.shreyas.modern.java.data.Student;
import dev.shreyas.modern.java.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Chapter06CustomSorting {
    // Sort Students with respect to names
    public static List<Student> getStudents(){
        return StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());
    }
    // Sort Students with respect to grade
    public static List<Student> getStudentsWithGradeAscending(){
        return StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparingInt(Student::getGradeLevel))
                .collect(Collectors.toList());
    }

    // Sort Students in descending order with respect to gpa
    public static List<Student> getStudentsWithGpaDesc(){
        return StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparingDouble(Student::getGpa).reversed())
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println("Students alphabetically printed:");
        getStudents().forEach(System.out::println);
        System.out.println("Students printed w.r.t grades:");
        getStudentsWithGradeAscending().forEach(System.out::println);
        System.out.println("Students printed w.r.t gpa desc:"+getStudentsWithGpaDesc());
        getStudentsWithGpaDesc().forEach(System.out::println);
    }
}
