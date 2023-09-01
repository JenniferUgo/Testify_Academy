package com.jennifer;

public class MyClass {
    private String instanceMember = "Delta";

    public void printName(String userName) {
        System.out.println("Instance Member: " + instanceMember);
        System.out.println("User's Name: " + userName);
    }

    public static void main(String[] args) {
        MyClass myObject = new MyClass();
        String userName = "John"; // Replace with the user's input
        myObject.printName(userName);
    }
}
