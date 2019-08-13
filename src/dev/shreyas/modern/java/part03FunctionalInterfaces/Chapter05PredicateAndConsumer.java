package dev.shreyas.modern.java.part03FunctionalInterfaces;

import dev.shreyas.modern.java.data.Student;
import dev.shreyas.modern.java.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Chapter05PredicateAndConsumer {
    // Filters Students with less than 3.9 GPA
    private Predicate<Student> gpaPredicate = student -> student.getGpa()>=3.9;
    // Filters Students with less than 3 Grade
    private Predicate<Student> gradePredicate = student -> student.getGradeLevel()>=3;

    // BiConsumer to print 2 items
    private BiConsumer<String, List<String>> printBiConsumer= (name,hobbiesList)-> {
        System.out.println(name+":"+hobbiesList.toString());
    };

    // Consumer for ForEach of list
    private Consumer<Student> studentConsumer = student ->{
        if(gpaPredicate.and(gradePredicate).test(student)){
            printBiConsumer.accept(student.getName(),student.getActivities());
        }
    };

    private void printStudentsWithGoodGrades(List<Student> students){
        students.forEach(studentConsumer);
    }

    public static void main(String[] args) {
        new Chapter05PredicateAndConsumer().printStudentsWithGoodGrades(StudentDataBase.getAllStudents());
    }

}
