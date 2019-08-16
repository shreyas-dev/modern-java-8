package dev.shreyas.modern.java.part05Streams;

import dev.shreyas.modern.java.data.Student;
import dev.shreyas.modern.java.data.StudentDataBase;

import java.util.Collection;

public class Chapter10AllAnyAndNoneMatch {
    // All Match -> Will return true if all elements in the stream satisfy the condition
    // Any Match -> Will return true if any one or more elements in the stream satisfy the condition
    // None Match -> Will return true if all elements in the stream doesn't satisfy the condition

    // All Match Example
    public static boolean allStudentPassed(){
        return StudentDataBase.getAllStudents().stream()
                .allMatch((student -> student.getGpa()>=3.5));
    }

    // Any Match Example
    public static boolean didAnyGetDistinction(){
        return StudentDataBase.getAllStudents().stream()
                .anyMatch((student -> student.getGpa()>4.0d));
    }

    // None Match Example
    public static boolean didAnyStudentHaveCyclingHobby(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(Collection::stream)
                .noneMatch((string)->!string.equals("cycling"));
    }

    public static void main(String[] args) {
        System.out.println("Did all students passed: "+allStudentPassed());
        System.out.println("Did Any students get distinction: "+didAnyGetDistinction());
        System.out.println("Did any student have a hobby of cycling:"+didAnyStudentHaveCyclingHobby());
    }


}
