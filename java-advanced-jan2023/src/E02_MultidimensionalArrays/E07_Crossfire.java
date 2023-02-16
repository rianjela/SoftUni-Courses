package E02_MultidimensionalArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class E07_Crossfire {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] matrixData = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int rows = matrixData[0];
        int cols = matrixData[1];

        List<List<Integer>> matrix = new ArrayList<>();
        fillMatrix(matrix, rows, cols);


        String[] nukeData = scanner.nextLine().split("\\s+");

        while (!nukeData[0].equals("Nuke")) {
            int nukeRow = Integer.parseInt(nukeData[0]);
            int nukeCol = Integer.parseInt(nukeData[1]);
            int nukeRadius = Integer.parseInt(nukeData[2]);

            //destroy vertical
            for (int currentRow = nukeRow - nukeRadius; currentRow <= nukeRow + nukeRadius; currentRow++) {
                if (isInMatrix(currentRow, nukeCol, matrix) && currentRow != nukeRow) {
                    matrix.get(currentRow).remove(nukeCol);
                }
            }
            for (int currentCol = nukeCol + nukeRadius; currentCol >= nukeCol - nukeRadius; currentCol--) {
                if (isInMatrix(nukeRow, currentCol, matrix)) {
                    matrix.get(nukeRow).remove(currentCol);
                }
            }

            matrix.removeIf(List::isEmpty);

            nukeData = scanner.nextLine().split("\\s+");
        }

        printMatrix(matrix);

    }

    private static void printMatrix(List<List<Integer>> matrix) {
        for (List<Integer> row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    private static boolean isInMatrix(int row, int col, List<List<Integer>> matrix) {
        return row >= 0 && row < matrix.size() && col >= 0 && col < matrix.get(row).size();
    }


    // fill the matrix
    private static void fillMatrix(List<List<Integer>> matrix, int rows, int cols) {
        int number = 1;
        for (int row = 0; row < rows; row++) {
            matrix.add(new ArrayList<>());
            for (int col = 0; col < cols; col++) {
                matrix.get(row).add(number++);
            }
        }
    }
}
