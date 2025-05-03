package org.java.coding;

/**
 * Initialize n as the length of diag two dimensional array
 * Initialize sum as 0
 * For i from 0 to n add Add diag[i][i] to sum. if i is not equal to array then add matrix[i][n-1-i]
 */

public class DiognalSum {
    public static int diognalSum(int[][] diag){
    	System.out.println("Checking merge conflict for collob");
        int n = diag.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += diag[i][i];
            if (i != n - 1 - i) {
                sum += diag[i][n - 1 - i];
            }
        }
        return sum;
    }

}
