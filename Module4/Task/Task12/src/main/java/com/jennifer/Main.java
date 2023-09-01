package com.jennifer;

import com.jennifer.package1.ClassA;
import com.jennifer.package2.ClassB;

public class Main {
    public static void main(String[] args) {
        // TestAccess.java in some other package or directory

        ClassA objA = new ClassA();
        objA.publicMethod(); // Accessing a public method from ClassA

        ClassB objB = new ClassB();
        objB.accessPrivateMethod(); // Accessing a private method from ClassB using a public method
    }
}

//Create two packages. in each of the packages create one class each Class A and Class B.
// create a method in class A that can be accessed anywhere in that project and create a method in
// Class B that can only be accessed within a class.