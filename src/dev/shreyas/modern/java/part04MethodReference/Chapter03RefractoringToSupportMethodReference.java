package dev.shreyas.modern.java.part04MethodReference;

import dev.shreyas.modern.java.data.Student;

import java.util.Arrays;
import java.util.function.Predicate;

public class Chapter03RefractoringToSupportMethodReference {
    static boolean isPass(Student student){
        return student.getGpa() >=3.9;
    }
    static Predicate<Student> predicate = Chapter03RefractoringToSupportMethodReference::isPass;

    public static void main(String[] args) {
        System.out.println(predicate.test(new Student("shreyas",5,4.8,"Male", Arrays.asList("coding","gym"))));
    }
}
