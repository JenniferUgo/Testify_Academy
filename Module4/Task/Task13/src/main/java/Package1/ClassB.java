package Package1;

public class ClassB {
    public static void main(String[] args) {
        // Create object 1 of class A using the default constructor
        ClassA obj1 = new ClassA();
        System.out.println("Object 1 value: " + obj1.getValue());

        // Create object 2 of class A using the parameterized constructor with one argument
        ClassA obj2 = new ClassA(10);
        System.out.println("Object 2 value: " + obj2.getValue());

        // Create object 3 of class A using the parameterized constructor with two arguments
        ClassA obj3 = new ClassA(5, 7);
        System.out.println("Object 3 value: " + obj3.getValue());
    }
}

