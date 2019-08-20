package dev.shreyas.modern.java.part10DefaultInterface.interfaces;

public interface InterfaceC extends InterfaceB {
    default void methodC(){
        System.out.println("Inside Interface C method C");
    }

    @Override
    default void methodA() {
        System.out.println("Inside Interface C method A");
    }
}
