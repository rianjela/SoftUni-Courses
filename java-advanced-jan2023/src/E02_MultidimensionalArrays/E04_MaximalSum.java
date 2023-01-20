package E02_MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class E04_MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int N = input[0];
        int M = input[1];

        int[][] matrix = new int[N][M];
        filMatrix(matrix, scanner);
        int[] startIndexes = new int[2];
        int maxSum = Integer.MIN_VALUE;

        for (int rows = 0; rows < matrix.length - 2; rows++) {
            for (int cols = 0; cols < matrix[0].length - 2; cols++) {

                int sum = 0;
                for (int i = rows; i < rows + 3; i++) {
                    for (int j = cols; j < cols + 3; j++) {
                        sum += matrix[i][j];
                    }
                }

                if (sum > maxSum) {
                    maxSum = sum;
                    startIndexes[0] = rows;
                    startIndexes[1] = cols;
                }

            }
        }
        System.out.println("Sum = " + maxSum);
        printMatrix3x3(matrix, startIndexes);
    }

    private static void printMatrix3x3(int[][] matrix, int[] startIndexes) {
        for (int row = startIndexes[0]; row < startIndexes[0] + 3; row++) {
            for (int col = startIndexes[1]; col < startIndexes[1] + 3; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }

    }

    private static int sum3x3(int[][] matrix3x3) {
        int sum = 0;
        for (int row = 0; row < matrix3x3.length; row++) {
            for (int col = 0; col < matrix3x3[0].length; col++) {
                sum += matrix3x3[row][col];
            }
        }
        return sum;
    }


    private static void filMatrix(int[][] matrix, Scanner scanner) {
        for (int row = 0; row < matrix.length; row++) {

            int[] rowNums = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            for (int col = 0; col < matrix[0].length; col++) {
                matrix[row][col] = rowNums[col];
            }
        }
    }


}
