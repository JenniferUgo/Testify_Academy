package com.jennifer.package1;

public class ClassA {
    // Public method accessible from anywhere in the project
    public static void main(String[] args) {
        ClassA access = new ClassA();
        access.publicMethod();
        // main method in ClassA
        System.out.println("This is the main method in ClassA.");
    }
    public void publicMethod() {
        System.out.println("This method can be accessed anywhere.");
    }


}

