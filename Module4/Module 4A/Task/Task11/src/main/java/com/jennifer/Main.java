package com.jennifer;

public class Main {
    class A {
        String getName(String name) {
            return name;
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        A objA = main.new A();
        String name = objA.getName("Jennifer Ugo");
        System.out.println("Name from Class A: " + name);
    }
}