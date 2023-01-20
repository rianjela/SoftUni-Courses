package E02_MultidimensionalArrays;

import java.util.Scanner;

public class E02_MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int r = Integer.parseInt(input[0]);
        int c = Integer.parseInt(input[1]);

        String[][] matrix = new String[r][c];

        fillingMatrix(r, c, matrix);
        printMatrix(matrix);

    }

    private static void fillingMatrix(int r, int c, String[][] matrix) {
        for (int row = 0; row < r; row++) {

            for (int col = 0; col < c; col++) {
                String outsideChars = (char) (row + 'a') + "";
                String middleChar = (char) (row + col + 'a') + "";
                String current = outsideChars + middleChar + outsideChars;
                matrix[row][col] = current;
            }
        }
    }

    private static void printMatrix(String[][] matrix) {
        for (int rows = 0; rows < matrix.length; rows++) {
            for (int cols = 0; cols < matrix[0].length; cols++) {
                System.out.print(matrix[rows][cols] + " ");
            }
            System.out.println();
        }

    }
}
