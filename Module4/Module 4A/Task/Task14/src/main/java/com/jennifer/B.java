package com.jennifer;

public class B {
    public static void main(String[] args) {
        ClassA.A square = new ClassA.A();
        square.setShapeLength(5.0);
        square.setShapeBreadth(5.0);

        double length = square.getShapeLength();
        double breadth = square.getShapeBreadth();

        double area = length * breadth;

        System.out.println("The area of a square of length: " + length + " and breadth: " + breadth + " is " + area);
    }
}

