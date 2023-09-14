package com.jennifer;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(5, 3));                // Call the first add method
        System.out.println(calculator.add(2.5, 4.0, 1.5));   // Call the second add method

        Converter converter = new Converter();
        System.out.println(converter.convertToDouble(42));      // Call the first convertToDouble method
        System.out.println(converter.convertToInt(3.14));       // Call the second convertToInt method

        StringManipulator manipulator = new StringManipulator();
        System.out.println(manipulator.concatenate("Hello, ", "world!"));       // Call the first concatenate method
        System.out.println(manipulator.concatenate(String.valueOf(42), " is the answer."));    // Call the second concatenate method
    }
}


//OVERLOADING: Create a method in a class and Overload in using the 3 different ways of overloading that you know.