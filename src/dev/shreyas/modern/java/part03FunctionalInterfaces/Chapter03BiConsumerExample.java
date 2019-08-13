package dev.shreyas.modern.java.part03FunctionalInterfaces;

import java.util.function.BiConsumer;

public class Chapter03BiConsumerExample {
    public static void main(String[] args) {

        //Consumer only accepts and returns void
        BiConsumer<String,String> biConsumer = (a,b)-> System.out.println("a: "+a+",b: "+b);
        biConsumer.accept("A","B");

        BiConsumer<Integer,Integer> multiplicationBiConsumer =(a,b)-> System.out.format("a*b:%d\n",a*b);
        multiplicationBiConsumer.accept(3,4);

        BiConsumer<Integer,Integer> division =(a,b)-> System.out.format("a/b:%d\n",a/b);
        // Consumer chaining
        multiplicationBiConsumer.andThen(division).accept(10,5);
    }
}
