package com.array;

public class ThreeDArray {
    public static void main(String[] args) {
        int[][][] array3D = new int[2][3][4]; // 2 layers, 3 rows, 4 columns

        // Initialize with dry-run debug output
        for (int i = 0; i < array3D.length; i++) {
            System.out.println("Entering Layer " + i);
            for (int j = 0; j < array3D[i].length; j++) {
                System.out.println("  Entering Row " + j + " of Layer " + i);
                for (int k = 0; k < array3D[i][j].length; k++) {
                    array3D[i][j][k] = i * 10 + j * 2 + k;
                    System.out.println("    Setting array3D[" + i + "][" + j + "][" + k + "] = " + array3D[i][j][k]);
                }
                System.out.println("  Completed Row " + j + " of Layer " + i);
            }
            System.out.println("Completed Layer " + i);
        }

        // Print the entire array for verification
        System.out.println("\nFinal 3D array content:");
        for (int i = 0; i < array3D.length; i++) {
            System.out.println("Layer " + i + ":");
            for (int j = 0; j < array3D[i].length; j++) {
                for (int k = 0; k < array3D[i][j].length; k++) {
                    System.out.print(array3D[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}

