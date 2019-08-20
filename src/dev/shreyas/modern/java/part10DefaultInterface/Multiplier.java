package dev.shreyas.modern.java.part10DefaultInterface;

import java.util.List;

interface Multiplier {
    int multiply(List<Integer> integers);

    // default method implementation
    default int size(List<Integer> integers){
        return integers.size();
    }

    static boolean isEmpty(List<Integer> integers){
         // size(integers)>0? false: true; can't access static size()
        return !(integers != null && integers.size() >0);
    }
}
