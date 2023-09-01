package com.jennifer;

// Main.java
public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();

        // Calling methods on the parent and child objects
        parent.method1(10);
        parent.method2("Hello from parent");

        child.method1(20);
        child.method2("Hello from child");
    }
}


//OVERRIDING: Create two methods in a parent class with arguements. write a print statement in the method body,
// Overide the 2 methods in the child class and write a diffreent print statement in the body of the overriding method