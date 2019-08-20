package dev.shreyas.modern.java.part10DefaultInterface;

import dev.shreyas.modern.java.part10DefaultInterface.interfaces.InterfaceA;
import dev.shreyas.modern.java.part10DefaultInterface.interfaces.InterfaceB;
import dev.shreyas.modern.java.part10DefaultInterface.interfaces.InterfaceC;

public class Chapter04MultipleInheritanceUsingDefault implements InterfaceA, InterfaceB, InterfaceC {
    // Prior to java 8 inheritance was not supported
    // But after java 8, due to default/static multiple behaviour
    // can be inherited to class

    public static void main(String[] args) {
        Chapter04MultipleInheritanceUsingDefault inheritanceUsingDefault = new Chapter04MultipleInheritanceUsingDefault();
        inheritanceUsingDefault.methodB();
        inheritanceUsingDefault.methodC();
        inheritanceUsingDefault.methodA(); // Since method A is overwritten in Interface C C.methodA will be called
    }

    // if this class implements methodA
    // Uncomment the below code and check the output.
//    @Override
//    public void methodA() {
//        System.out.println("Inside Class Chapter04MultipleInheritanceUsingDefault method A");
//    }

    // Precedence is
    // 1) Class which implements the function
    // 2) Interface which implements the Interface
    // 3) If no overriding , then the Interface default method is called.
}
