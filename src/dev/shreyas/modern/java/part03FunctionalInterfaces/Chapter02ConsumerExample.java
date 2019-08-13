package dev.shreyas.modern.java.part03FunctionalInterfaces;

import dev.shreyas.modern.java.data.Student;
import dev.shreyas.modern.java.data.StudentDataBase;
import java.util.List;
import java.util.function.Consumer;


public class Chapter02ConsumerExample {
    private static Consumer<Student> studentNameConsumer = (student)-> {
        System.out.println(student.getName());
    };
    private static Consumer<Student> studentActivityConsumer = (student)-> {
        System.out.println(student.getActivities().toString());
    };
    private static void printNames(){
        List<Student> studentList = StudentDataBase.getAllStudents();
        // For each takes an consumer input
        studentList.forEach(studentNameConsumer);
    }
    private static void printNamesAndActivites(){
        List<Student> studentList =StudentDataBase.getAllStudents();

        // this is called consumer chaining
        studentList.forEach(studentNameConsumer.andThen(studentActivityConsumer));

    }
    public static void printNameAndActivitiesUsingCondition(){
        List<Student> studentList = StudentDataBase.getAllStudents();

        // This is called Inline consumer/ Anonymous Consumer
        studentList.forEach((student)->{
            if (student.getGradeLevel()>=3 && student.getGpa()>=3.9){
                // Code reusability
                studentNameConsumer.andThen(studentActivityConsumer).accept(student);
            }
        });
    }

    public static void main(String[] args) {
//        printNamesAndActivites();
        printNameAndActivitiesUsingCondition();
    }
}
