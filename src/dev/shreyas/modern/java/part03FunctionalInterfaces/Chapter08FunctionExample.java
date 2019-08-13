package dev.shreyas.modern.java.part03FunctionalInterfaces;

import dev.shreyas.modern.java.data.Student;
import dev.shreyas.modern.java.data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class Chapter08FunctionExample {
    static Function<List<Student>, Map<String,Double>> studentFunction = (students -> {
       Map<String,Double> studentGradeMap=new HashMap<>();
       students.forEach((student)->{
           studentGradeMap.put(student.getName(),student.getGpa());
       });
       return studentGradeMap;
    });
    public static void main(String[] args) {
        System.out.println(studentFunction.apply(StudentDataBase.getAllStudents()));
    }
}
