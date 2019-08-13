package dev.shreyas.modern.java.part04MethodReference;

import java.util.function.Consumer;

public class Chapter05LambdaVariables {
    // Limitation of Variables in Lambda
    public static void main(String[] args) {
        int i=0;
        // replace i1 with i and you can see compiler error
        // saying i is already declared in the scope
        Consumer<Integer> c1 = (i1)->{
            System.out.println(i1);
        };
        int j=4; //local variable
        Consumer<Integer> c2 =(ij)->{
            // Not possible. As local variable that is being referenced
//          j=ij;
        };
    }
}
