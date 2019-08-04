package dev.shreyas.modern.java.part01ImperativeVsDeclarative;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Chapter02ImperativeVsDeclarative {
    public static void main(String[] args) {
        /*
         * Problem : Remove duplicates from the list
         */
        List<Integer> integerList = Arrays.asList(1,2,3,1,3,4,5,5,5,6,7,8,8,8,8,9,10,9);
        /*
         * Imperative way
         */
        List<Integer> uniqueList = new ArrayList<>();
        for (Integer integer : integerList){
            if (!uniqueList.contains(integer)){
                uniqueList.add(integer);
            }
        }
        System.out.println("Unique list using imperative way : "+uniqueList);

        /*
         * Declarative way
         */
        List<Integer> uniqueList1=integerList.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Unique List using declarative way: "+uniqueList1.toString());


    }
}
