package com.jennifer;

public class ClassB {
    // B.java
    public static class B extends ClassA {
        void method4() {
            System.out.println("Method 4 in class B");
        }

        void method5() {
            System.out.println("Method 5 in class B");
        }

        public void main(String[] args) {
            B b = new B();

            // Calling methods from the parent class A
            b.method1();
            b.method2();
            b.method3();

            // Calling methods from the child class B
            b.method4();
            b.method5();
        }

        private void method3() {
        }

        private void method2() {
        }

        private void method1() {
        }
    }

}
