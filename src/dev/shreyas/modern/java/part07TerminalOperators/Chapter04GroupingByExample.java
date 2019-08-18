package dev.shreyas.modern.java.part07TerminalOperators;

import dev.shreyas.modern.java.data.Student;
import dev.shreyas.modern.java.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Chapter04GroupingByExample {
    // groupingBy() is equivalent to the groupBy operation in SQL
    // Used to group elements based on a property
    // Output -> Map<k,V>

    private static void printMaleAndFemaleStudents(){
        Map<String, List<Student>> genderBasedMap = StudentDataBase.getAllStudents().stream()
                .collect(Collectors.groupingBy(Student::getGender));
        genderBasedMap.forEach((gender,list)->{
            list.forEach((student)->{
                System.out.println("Name :"+student.getName()+"\tGender :"+gender);
            });
        });
    }

    private static void aggregateOutstandingvsAverageStudents(){
        Map map = StudentDataBase.getAllStudents().stream()
                .collect(Collectors.groupingBy((student -> {
                    if(student.getGpa()>=3.8)
                        return "OUTSTANDING Student";
                    else
                        return "AVERAGE Student";
                })));
        System.out.println(map);
    }


    public static void main(String[] args) {
        printMaleAndFemaleStudents();
        aggregateOutstandingvsAverageStudents();
    }
}
