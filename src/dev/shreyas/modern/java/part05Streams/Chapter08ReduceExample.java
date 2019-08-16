package dev.shreyas.modern.java.part05Streams;

import dev.shreyas.modern.java.data.Student;
import dev.shreyas.modern.java.data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Chapter08ReduceExample {
    // Reduce is a terminal Function. Until now we used only collect terminal function.
    // Reduce function is used to reduce the contents in the stream to single value
    // Simple Reduce example
    private static int getMultipliedList(List<Integer> integers){
        return integers.stream()
                // 1st Param ->Identity is 1 , which means the default value
                // 1st iteration -> a = 1 (Identity) b= 1, 1st element from the list ,accumulator =1
                // 2nd iteration -> a = accumulator i.e 1 , b =3 , accumulator is 3
                // 3rd iteration -> a = 3, b=5, accumulator is 15
                // 4th iteration -> a = 15 , b=7 , accumulator is 105
                .reduce(1,(a,b)->a*b);
    }

    // Get Avg gpa of students
    // Optional is used to take care of null elements in returns
    private static Optional<Double> getGpaAverage(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getGpa)
                .reduce((a,b)->(a+b)/2);
    }

    private static Optional<Student> getHighestGpaStudent(){
        return StudentDataBase.getAllStudents().stream()
                //  Using ternary operator a>b? a:b;
                .reduce((s1,s2)->s1.getGpa()>s2.getGpa()?s1:s2);
    }

    public static void main(String[] args) {
        System.out.println(getMultipliedList(Arrays.asList(1,3,5,7)));
        System.out.println("Average of all student GPA: "+getGpaAverage().get());
        System.out.println("Get highest GPA student:"+getHighestGpaStudent().get());
    }
}
