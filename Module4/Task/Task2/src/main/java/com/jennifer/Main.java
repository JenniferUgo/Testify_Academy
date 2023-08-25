package com.jennifer;

public class Main {
    public static void main(String[] args) {
        // Integer data type
        int integerVariable = 42;
        System.out.println("Integer Variable: " + integerVariable);

        // Double data type
        double doubleVariable = 3.14159265359;
        System.out.println("Double Variable: " + doubleVariable);

        // Boolean data type
        boolean booleanVariable = true;
        System.out.println("Boolean Variable: " + booleanVariable);

        // Character data type
        char charVariable = 'A';
        System.out.println("Character Variable: " + charVariable);

        // String data type
        String stringVariable = "Hello, World!";
        System.out.println("String Variable: " + stringVariable);

        // Array data type
        int[] arrayVariable = {1, 2, 3, 4, 5};
        System.out.print("Array Variable: ");
        for (int i = 0; i < arrayVariable.length; i++) {
            System.out.print(arrayVariable[i] + " ");
        }
        System.out.println();
    }
}

// Print out all 6 variables that are all different data types on your console