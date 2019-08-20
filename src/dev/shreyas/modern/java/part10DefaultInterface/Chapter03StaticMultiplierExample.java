package dev.shreyas.modern.java.part10DefaultInterface;

import java.util.Arrays;
import java.util.List;

public class Chapter03StaticMultiplierExample {

    public static void main(String[] args) {
        MultiplierImpl multiplierImpl = new MultiplierImpl();
        List<Integer> integers = Arrays.asList(1,2,3,4,5);
        System.out.println(multiplierImpl.size(integers));
        // Not override size method
        Multiplier multiplier = (intList) -> intList.stream().reduce(1,(x, y)->x*y);
        System.out.println(multiplier.size(integers));


    }
}
