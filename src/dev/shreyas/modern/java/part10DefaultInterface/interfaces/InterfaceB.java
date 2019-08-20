package dev.shreyas.modern.java.part10DefaultInterface.interfaces;

public interface InterfaceB extends InterfaceA{
   default void methodB(){
       System.out.println("Inside Interface B method B");
   }
}
