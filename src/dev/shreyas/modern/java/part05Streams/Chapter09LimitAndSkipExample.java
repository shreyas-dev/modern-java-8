package dev.shreyas.modern.java.part05Streams;

import dev.shreyas.modern.java.data.Student;
import dev.shreyas.modern.java.data.StudentDataBase;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Chapter09LimitAndSkipExample {
    // Limit: Limits the elements in the list to specified number ,
    // limit(3)-> means take first 3 elements in the stream and ignore the rest

    //Skips: Skips specified elements present in the stream
    // skips(2) -> means in a stream containing 1,2,3,4,5. 1 and 2 are ignored,
    // the stream considers elements from 3.

    // Get first three students
    public static List<Student> getTopThreeStudents(){
        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparingDouble(Student::getGpa).reversed()) // Reserved function will reverse the list desc
                .limit(3) // Will take first 3 students
                .collect(Collectors.toList());
    }

    public static Optional<Integer> skipFirstTwoAndSum(List<Integer> integers){
        return integers.stream()
                .skip(2)
                .reduce(Integer::sum); // Using lambda Integer::sum instead of (a,b) -> a+b
    }
    public static void main(String[] args) {
        System.out.println("Top 3 students are");
        getTopThreeStudents().forEach(System.out::println);
        System.out.println(skipFirstTwoAndSum(Arrays.asList(1,2,3,4,5)));

    }
}
