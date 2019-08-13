package dev.shreyas.modern.java.part03FunctionalInterfaces;

import dev.shreyas.modern.java.data.Student;
import dev.shreyas.modern.java.data.StudentDataBase;

import java.util.List;
import java.util.function.Supplier;

public class Chapter10Supplier {
    // Supplier is exactly opposite to consumer
    // Supplier returns where as consumer accepts
    // it has a get() method
    static Supplier<List<Student>> studentSupplier= StudentDataBase::getAllStudents;
    // Both are same
//    static Supplier<List<Student>> studentSupplier= () -> StudentDataBase.getAllStudents();
    public static void main(String[] args) {
        System.out.println(studentSupplier.get());
    }
}
