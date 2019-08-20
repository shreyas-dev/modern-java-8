package dev.shreyas.modern.java.part09Optional;

import dev.shreyas.modern.java.data.Student;
import dev.shreyas.modern.java.data.StudentDataBase;

import java.util.Optional;

public class Chapter03OrElseExample {
    //orElse using optinal.map , orElse will only be executed
    // if map() gets a null
    public static String optionalOrElse(){
        Student student=new Student();
        Optional<Student> optional = Optional.ofNullable(student);
        return optional.map(Student::getName).orElse("default");
    }

    //orElseGet is similar to orElse only difference being
    // orElseGet takes supplier as an argument
    public static String optionalOrElseGet(){
        Student student=new Student();
        student.setName("shreyas");
        Optional<Student> optional = Optional.ofNullable(student);
        return optional.map(Student::getName).orElseGet(() -> "default");
    }
    //orElseThrow throws an null pointer Exception is the value is null
    public static String optionalOrElseThrow(){
        Student student=new Student();
        Optional<Student> optional = Optional.ofNullable(student);
        return optional.map(Student::getName).orElseThrow(()->new RuntimeException("Student has no name"));
    }
    public static void main(String[] args) {
        System.out.println(optionalOrElse());
        System.out.println(optionalOrElseGet());
        System.out.println(optionalOrElseThrow());
    }
}
