package dev.shreyas.modern.java.part07TerminalOperators;

import dev.shreyas.modern.java.data.Student;
import dev.shreyas.modern.java.data.StudentDataBase;

import java.util.Set;
import java.util.stream.Collectors;

public class Chapter01CollectTerminalOperator {
    // Terminal Operators starts the stream pipeline
    // foreach,min,max reduce etc

    // Joining Example, joins all the elements to one
    // joining has 3 args, all args are optional
    // 1st -> delimiter , 2nd is prefix and 3rd is suffix
    private static String getAllStudentNames(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .sorted()
                .collect(Collectors.joining(",","All Student Names are :","\n"));
    }

    // Counting Example , Counts the number of elements present in the stream
    private static long getStudentCount(){
        return StudentDataBase.getAllStudents().stream()
                .collect(Collectors.counting());
    }

    // Mapping -> First performs data transformation then collects the data
    private static Set<String> getUniqueStudentNames(){
        return StudentDataBase.getAllStudents().stream()
                // instead of .map().collect(toSet)
                .collect(Collectors.mapping(Student::getName,Collectors.toSet()));
    }

    public static void main(String[] args) {
        System.out.println(getAllStudentNames());
        System.out.println(getStudentCount());
    }
}
