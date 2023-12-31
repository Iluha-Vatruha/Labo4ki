package domain;

import java.util.Arrays;

public class Matrix {
    public static double dioSum(short[][] matrix) {
        int n = matrix.length;
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += matrix[i][i];
            sum += matrix[i][n - 1 - i]; //n-1 - Последний элемент строки
        }
        if (n % 2 == 1) {
            sum -= matrix[n / 2][n / 2];
        }
        return sum;
    }

    public static double geoMult(short[][] matrix) {
        double n = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                n *= matrix[i][j];
            }
        }
        n /= matrix.length * matrix.length;
        return n;
    }

    public static double matrixPop(short[][] matrix){
        int [] array = new int [2*32768];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                array[matrix[i][j] + 32768] += 1;
            }
        }
        double max_value = 0;
        int max_count = 0;
        for (int i = 0; i < array.length; i++) {
            if (max_count < array[i]){
                max_value = i-32768;
                max_count = array[i];
            }
        }
        return max_value;
    }
}

