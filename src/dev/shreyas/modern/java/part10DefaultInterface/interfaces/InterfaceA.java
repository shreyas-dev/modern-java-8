package dev.shreyas.modern.java.part10DefaultInterface.interfaces;

public interface InterfaceA {
    default void methodA(){
        System.out.println("Inside Interface A method A");
    }
}
