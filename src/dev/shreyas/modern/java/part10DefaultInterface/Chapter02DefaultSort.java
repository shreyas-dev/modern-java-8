package dev.shreyas.modern.java.part10DefaultInterface;

import dev.shreyas.modern.java.data.Student;
import dev.shreyas.modern.java.data.StudentDataBase;

import java.util.*;
import java.util.function.Consumer;

public class Chapter02DefaultSort {
    static Consumer<Student> print = (System.out::println);
    static Comparator<Student> nameComparator = Comparator.comparing(Student::getName);
    static Comparator<Student> gpaComparator = Comparator.comparingDouble(Student::getGpa);
    private static void sortStudentsAlphabetically(List<Student> studentList){
        studentList.sort(nameComparator);
        System.out.println();
        System.out.println("Sorting alphabetically ");
        System.out.println();
        studentList.forEach(print);
    }
    private static void sortStudentByGPA(List<Student> studentList){
        studentList.sort(gpaComparator);
        System.out.println();
        System.out.println("Sorting by GPA ");
        System.out.println();
        studentList.forEach(print);
    }

    // thenComparing is used to chain comparators.
    // first it sorts by gpa and if two students have the same
    // gpa it'll sort by student's name
    private static void sortStudentByGPAAndAlphabetically(List<Student> studentList){
        studentList.sort(gpaComparator.thenComparing(nameComparator));
        System.out.println();
        System.out.println("Sorting by GPA and Alphabetically ");
        System.out.println();
        studentList.forEach(print);
    }

    //

    private static void sortStudentByGPAAndAlphabeticallyWithNullValues(List<Student> studentList){
        Comparator<Student> nullFirst = Comparator.nullsLast(gpaComparator).thenComparing(Comparator.nullsLast(nameComparator));
        studentList.sort(nullFirst);
        System.out.println();
        System.out.println("Sorting by GPA and Alphabetically ");
        System.out.println();
        studentList.forEach(print);
    }

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>(StudentDataBase.getAllStudents());
        System.out.println("Before Sorting :");
        studentList.forEach(print);
        sortStudentsAlphabetically(studentList);
        sortStudentByGPA(studentList);
        sortStudentByGPAAndAlphabetically(studentList);
        Student student = new Student();
        studentList.add(student);
        sortStudentByGPAAndAlphabeticallyWithNullValues(studentList);
    }
}
