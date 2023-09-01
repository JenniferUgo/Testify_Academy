package com.jennifer.package2;
import com.jennifer.package1.ClassA;

public class ClassB {
    // Private method accessible only within this class
    public static void main(String[] args) {
        // Access methods within ClassB
        ClassB objB = new ClassB();
        objB.accessPrivateMethod();
    }
    private void privateMethod() {
        System.out.println("This method can only be accessed within ClassB.");
    }

    // A public method that can be used to access the private method
    public void accessPrivateMethod() {
        privateMethod();
    }
}
