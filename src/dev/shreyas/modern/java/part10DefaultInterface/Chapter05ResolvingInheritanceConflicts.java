package dev.shreyas.modern.java.part10DefaultInterface;

import dev.shreyas.modern.java.part10DefaultInterface.interfaces.InterfaceA;
import dev.shreyas.modern.java.part10DefaultInterface.interfaces.InterfaceA1;

public class Chapter05ResolvingInheritanceConflicts implements InterfaceA, InterfaceA1 {
    // Now both Interface A and A1 has method A()
    // the only way to resolve the conflict is to override it in the implementing class
    @Override
    public void methodA() {
        System.out.println("Forcefully overriding to avoid conflicts");
    }

    public static void main(String[] args) {
        Chapter05ResolvingInheritanceConflicts chapter05ResolvingInheritanceConflicts = new Chapter05ResolvingInheritanceConflicts();
        chapter05ResolvingInheritanceConflicts.methodA();// if methodA was not implemented in this class
        // then the program won't compile
    }
}
