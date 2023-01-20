package E02_MultidimensionalArrays;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class E03_DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[n][n];

        fillMatrix(matrix, scanner);

        System.out.println(Math.abs(primaryDiagonalSum(matrix) - secondaryDiagonalSum(matrix)));

    }

    private static int secondaryDiagonalSum(int[][] matrix) {
        int sumSecond = 0;

        for (int cols = 0; cols < matrix.length; cols++) {
            for (int rows = matrix.length; rows >= 0; rows--) {
                if (rows == matrix.length - 1 - cols) {
                    sumSecond += matrix[rows][cols];
                }
            }
        }
        return sumSecond;
    }

    private static int primaryDiagonalSum(int[][] matrix) {
        int sum = 0;
        for (int rows = 0; rows < matrix.length; rows++) {
            for (int cols = 0; cols < matrix.length; cols++) {
                if (rows == cols) {
                    sum += matrix[rows][cols];
                }
            }
        }
        return sum;
    }

    private static void fillMatrix(int[][] matrix, Scanner scanner) {
        for (int rows = 0; rows < matrix.length; rows++) {
            int[] input = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            for (int cols = 0; cols < matrix.length; cols++) {
                matrix[rows][cols] = input[cols];
            }
        }
    }


}
