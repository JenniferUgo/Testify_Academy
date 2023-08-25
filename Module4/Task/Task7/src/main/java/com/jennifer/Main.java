package com.jennifer;

public class Main {
    public static void main(String[] args) {
        // Create a 2D array with 4 rows and 3 columns
        String[][] fruitsArray = new String[4][3];

        // Fill the first column with fruits
        fruitsArray[0][0] = "Udara";
        fruitsArray[1][0] = "Pawpaw";
        fruitsArray[2][0] = "Orange";
        fruitsArray[3][0] = "Soursop";

        // Print the 2D array
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(fruitsArray[i][j] + "\t");
            }
            System.out.println(); // Move to the next row
        }
    }
}


//create a two-dimensional array with 4 rows and 3 columns. Fill only the first column with any fruits of ur choice