package dev.shreyas.modern.java.part03FunctionalInterfaces;

import dev.shreyas.modern.java.data.Student;
import dev.shreyas.modern.java.data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class Chapter09BiFunction {

    static Predicate<Student> gpaFilterPredicate = student -> student.getGpa() >= 3.9;
    // BiFunction<T, U, R> T and U are inputs and R is the return type
    static BiFunction<List<Student>, Predicate<Student>, Map<String,Double>> biFunction =
            ((students, studentPredicate) -> {
             Map<String,Double> studentGradeMap = new HashMap<>();
             students.forEach(student->{
                 if (studentPredicate.test(student)){
                     studentGradeMap.put(student.getName(),student.getGpa());
                 }
             });
             return studentGradeMap;
            });
    public static void main(String[] args) {
        System.out.println(biFunction.apply(StudentDataBase.getAllStudents(),gpaFilterPredicate));
    }
}
