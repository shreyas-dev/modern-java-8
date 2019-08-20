package dev.shreyas.modern.java.part09Optional;

import java.util.Optional;

public class Chapter02EmptyOfNullable {
    // Optional.empty() -> return an empty object
    //ofNullable() -> doesn't throw an error if parameter passed is null
    //of() -> throws an NullPointerException if parameter passed is null

    public static void main(String[] args) {
        System.out.println("Empty object:"+Optional.empty()); // Returns an empty object
        System.out.println("ofNullable() with null: "+ Optional.ofNullable(null)); // Returns an empty object
        System.out.println("ofNullable() with null: "+ Optional.ofNullable("Hello")); // Returns an String optional
        System.out.println("of() with null"+ Optional.of(null)); // throws an NullPointerException

        ifPresentExample();
    }

    // ifPresent and isPresent
    // ifPresent () , if present then a consumer is executed
    public static void ifPresentExample(){
        Optional<String> stringOptional=Optional.ofNullable(null);
        if (stringOptional.isPresent()){
            System.out.println("Is present");
        }else{
            stringOptional=Optional.ofNullable("hello");
           stringOptional.ifPresent(System.out::println);
        }
    }


}
