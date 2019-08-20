package dev.shreyas.modern.java.part10DefaultInterface;

import java.util.List;

public class MultiplierImpl implements Multiplier {
    @Override
    public int multiply(List<Integer> integers) {
        return integers.stream()
                .reduce(1,(x,y)->x*y);
    }

    // Override default method
    @Override
    public int size(List<Integer> integers) {
        System.out.println("Overriding interface default size method ");
        return integers.size();
    }
}
