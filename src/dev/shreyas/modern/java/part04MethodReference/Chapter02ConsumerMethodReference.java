package dev.shreyas.modern.java.part04MethodReference;

import dev.shreyas.modern.java.data.Student;
import dev.shreyas.modern.java.data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class Chapter02ConsumerMethodReference {
    static Consumer<Student> studentConsumer = System.out::println;

    static Consumer<List<Student>> listConsumer= ((list)->list.forEach(studentConsumer));
    public static void main(String[] args) {
        listConsumer.accept(StudentDataBase.getAllStudents());
    }
}
