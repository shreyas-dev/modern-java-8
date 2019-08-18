package dev.shreyas.modern.java.part07TerminalOperators;

import dev.shreyas.modern.java.data.Student;
import dev.shreyas.modern.java.data.StudentDataBase;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Chapter06GroupingByWithMaxNMinBy {
    // MaxBy Example
    private static void getGradWiseTopGpaStudents(){
        Map<Integer, Optional<Student>> gradeWise = StudentDataBase.getAllStudents().stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel,Collectors.maxBy(Comparator.comparingDouble(Student::getGpa))));
        System.out.println(gradeWise);

        Map<Integer, Student> gradeWiseWithoutOptional = StudentDataBase.getAllStudents().stream()
                // using collectingAndThen to remove Optional return, after it gets optional, it does optional::get
                .collect(Collectors.groupingBy(Student::getGradeLevel,Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingDouble(Student::getGpa)),Optional::get)));
        System.out.println(gradeWiseWithoutOptional);
    }


    // MinBy
    private static void getGradWiseBottomGpaStudents(){

        Map<Integer, Student> gradeWiseWithoutOptional = StudentDataBase.getAllStudents().stream()
                // using collectingAndThen to remove Optional return, after it gets optional, it does optional::get
                .collect(Collectors.groupingBy(Student::getGradeLevel,Collectors.collectingAndThen(Collectors.minBy(Comparator.comparingDouble(Student::getGpa)),Optional::get)));
        System.out.println(gradeWiseWithoutOptional);
    }
    public static void main(String[] args) {
        getGradWiseTopGpaStudents();
        getGradWiseBottomGpaStudents();
    }
}
