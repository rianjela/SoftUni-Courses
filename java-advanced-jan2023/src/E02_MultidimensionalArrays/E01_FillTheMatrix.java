package E02_MultidimensionalArrays;

import java.util.Scanner;

public class E01_FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int n = Integer.parseInt(input.split(", ")[0]);
        String typeMatrix = input.split(", ")[1];

        int[][] matrix = new int[n][n];
        int filler = 1;
        switch (typeMatrix) {
            case "A":
                fillMatrixTypeA(matrix, n);
                break;
            case "B":
                fillMatrixTypeB(matrix);
                break;
        }

        printMatrix(matrix, n);

    }

    private static void fillMatrixTypeB(int[][] matrix) {

        int filler = 1;

        for (int cols = 0; cols < matrix.length; cols++) {

            if (cols % 2 == 0) {
                for (int rows = 0; rows < matrix.length; rows++) {
                    matrix[rows][cols] = filler;
                    filler++;
                }
            } else {
                for (int rows = matrix.length - 1; rows >= 0; rows--) {
                    matrix[rows][cols] = filler;
                    filler++;
                }
            }
        }
    }


    private static void fillMatrixTypeA(int[][] matrix, int n) {
        int filler = 1;

        for (int cols = 0; cols < n; cols++) {
            for (int rows = 0; rows < n; rows++) {
                matrix[rows][cols] = filler;
                filler++;
            }
        }
    }

    private static void printMatrix(int[][] matrix, int n) {
        for (int rows = 0; rows < n; rows++) {
            for (int cols = 0; cols < n; cols++) {
                System.out.print(matrix[rows][cols] + " ");
            }
            System.out.println();
        }
    }


}
