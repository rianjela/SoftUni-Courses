package E02_MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class E05_MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //"swap row1 col1 row2 col2"

        int[] matrixData = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        String[][] matrix = new String[matrixData[0]][matrixData[1]];

        fillMatrix(scanner, matrix);


        String[] command = scanner.nextLine().split("\\s+");

        while (!command[0].equals("END")) {

            //invalid inputs
            if (!command[0].equals("swap") || command.length != 5 || !areCoordinatesValid(matrix, command)) {
                System.out.println("Invalid input!");
            } else {
                //valid inputs

                swapCoordinates(matrix, command);
                printMatrix(matrix);

            }


            command = scanner.nextLine().split("\\s+");
        }


    }
    //printMatrix
    private static void printMatrix(String[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }

    }
    //swapping the coordinates
    private static void swapCoordinates(String[][] matrix, String[] coordinates) {
        int row1 = Integer.parseInt(coordinates[1]);
        int col1 = Integer.parseInt(coordinates[2]);
        int row2 = Integer.parseInt(coordinates[3]);
        int col2 = Integer.parseInt(coordinates[4]);

        String matrixData1 = matrix[row1][col1];
        String matrixData2 = matrix[row2][col2];

        matrix[row1][col1] = matrixData2;
        matrix[row2][col2] = matrixData1;
    }

    //check the validity of the coordinates
    private static boolean areCoordinatesValid(String[][] matrix, String[] coordinates) {
        int matrixRowsCount = matrix.length;
        int matrixColsCount = matrix[0].length;
        int row1 = Integer.parseInt(coordinates[1]);
        int col1 = Integer.parseInt(coordinates[2]);
        int row2 = Integer.parseInt(coordinates[3]);
        int col2 = Integer.parseInt(coordinates[4]);

        if (row1 > matrixRowsCount - 1 || row2 > matrixRowsCount - 1 || col1 > matrixColsCount - 1 || col2 > matrixColsCount - 1) {
            return false;
        } else {
            return true;
        }
    }

    //filling the matrix method
    private static void fillMatrix(Scanner scanner, String[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            String[] rowData = scanner.nextLine().split(" ");
            for (int col = 0; col < matrix[0].length; col++) {
                matrix[row][col] = rowData[col];
            }
        }
    }
}
