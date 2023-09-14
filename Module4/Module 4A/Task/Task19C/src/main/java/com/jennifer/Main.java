package com.jennifer;

class A {
    String name = "Ronke";
}

class B extends A {
    String name = "Anderson";
}

public class Main {
    public static void main(String[] args) {
        B b = new B();
        System.out.println("Value of name in Class A: " + ((A) b).name); // Access Class A's variable using type casting
        System.out.println("Value of name in Class B: " + b.name);
    }
}
