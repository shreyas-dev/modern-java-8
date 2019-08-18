package dev.shreyas.modern.java.part07TerminalOperators;

import dev.shreyas.modern.java.data.Student;
import dev.shreyas.modern.java.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Chapter07PartitionByExample {
    // PartitionBy is also kind of groupingBy() only difference
    // being it accepts Predicate as an input because of which output
    // will be a map with key being either of 2 Boolean values .i.e True and False
    private static void studentPassOrFailMap(){
        Predicate<Student> determinePassOrFailPredicate = (student)-> student.getGpa()>=3.8;
        Map<Boolean, List<Student>> map = StudentDataBase.getAllStudents().stream()
                .collect(Collectors.partitioningBy(determinePassOrFailPredicate));
        System.out.println(map);
    }

    private static void studentPassOrFailMapWithSet(){
        Predicate<Student> determinePassOrFailPredicate = (student)-> student.getGpa()>=3.8;
        Map<Boolean, Set<Student>> map = StudentDataBase.getAllStudents().stream()
                .collect(Collectors.partitioningBy(determinePassOrFailPredicate,Collectors.toSet()));
        System.out.println(map);
    }

    public static void main(String[] args) {
        studentPassOrFailMap();
        studentPassOrFailMapWithSet();
    }
}
