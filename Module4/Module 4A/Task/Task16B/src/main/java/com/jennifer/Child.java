package com.jennifer;

// Child.java
public class Child extends Parent {
    // Override method1 with a different print statement
    @Override
    public void method1(int num) {
        System.out.println("Child class - Overridden Method 1: " + num);
    }

    // Override method2 with a different print statement
    @Override
    public void method2(String text) {
        System.out.println("Child class - Overridden Method 2: " + text);
    }
}

