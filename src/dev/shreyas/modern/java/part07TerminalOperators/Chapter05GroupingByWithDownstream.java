package dev.shreyas.modern.java.part07TerminalOperators;

import dev.shreyas.modern.java.data.Student;
import dev.shreyas.modern.java.data.StudentDataBase;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Chapter05GroupingByWithDownstream {
    // groupingBy() with downgrade
    // this is called two level mapping
    private static void twoLevelMapping(){
        Map<String,Map<String, List<Student>>> genderBasedGrading = StudentDataBase.getAllStudents().stream()
                // groupingBy (first key condition, groupingBy(Function))
                // groupingBy with downgrade
                .collect(Collectors.groupingBy(Student::getGender,Collectors.groupingBy((student)->{
                    if(student.getGpa()>=3.8)
                        return "OUTSTANDING Student";
                    else
                        return "AVERAGE Student";
                })));
        System.out.println(genderBasedGrading);
    }
    // 3 args version of groupingBy
    private static void getGradeLevelStudents(){
        LinkedHashMap<Integer, Set<Student>> gradeLevelStudents =   StudentDataBase.getAllStudents().stream()
                    // groupingBy(key,which kind of map, List or set or any downstream for 3 level mapping)
                    .collect(Collectors.groupingBy(Student::getGradeLevel, LinkedHashMap::new,Collectors.toSet()));
        System.out.println(gradeLevelStudents);
    }

    public static void main(String[] args) {
        twoLevelMapping();
        getGradeLevelStudents();
    }
}
