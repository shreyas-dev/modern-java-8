package dev.shreyas.modern.java.part07TerminalOperators;

import dev.shreyas.modern.java.data.Student;
import dev.shreyas.modern.java.data.StudentDataBase;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

public class Chapter02MinByMaxByExample {

    // MinBy-> returns min element based on the property passed in the comparator
    private static Optional<Student> getLeastGpaStudent(){
        return StudentDataBase.getAllStudents().stream()
                .collect(Collectors.minBy(Comparator.comparingDouble(Student::getGpa)));
    }

    // MaxBy -> returns max element based on the property passed in the comparator
    private static Optional<Student> getHighestGpaStudent(){
        return StudentDataBase.getAllStudents().stream()
                .collect(Collectors.maxBy(Comparator.comparingDouble(Student::getGpa)));
    }

    public static void main(String[] args) {
        System.out.println("Student with lowest GPA:"+getLeastGpaStudent());
        System.out.println("Student with Highest GPA:"+getHighestGpaStudent());
    }
}
