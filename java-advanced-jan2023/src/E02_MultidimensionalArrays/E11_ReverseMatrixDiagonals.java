package E02_MultidimensionalArrays;

import java.util.Scanner;

public class E11_ReverseMatrixDiagonals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] matrixData = scanner.nextLine().split("\\s+");
        int rowsTotal = Integer.parseInt(matrixData[0]);
        int colsTotal = Integer.parseInt(matrixData[1]);

        String[][] matrix = new String[rowsTotal][colsTotal];

        fillMatrix(scanner, matrix);

        int row = rowsTotal - 1;
        int col = colsTotal - 1;

        while (row != -1) {

            int currentCol = col;
            int currentRow = row;
            while (currentCol < colsTotal && currentRow >= 0) {
                System.out.print(matrix[currentRow--][currentCol++] + " ");
            }
            System.out.println();

            col--;
            if (col == -1) {
                col = 0;
                row--;
            }
        }


    }


    private static void fillMatrix(Scanner scanner, String[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            String[] rowInput = scanner.nextLine().split("\\s+");
            for (int col = 0; col < matrix[0].length; col++) {
                matrix[row][col] = rowInput[col];
            }
        }
    }
}
