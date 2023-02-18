package Exam_Prep.Exam_22October2022;

import java.util.Scanner;

public class E02_RallyRacing {
    static final String SPLIT_REGEX = "\\s+";
    static final int REGULAR_MOVEMENT = 10;
    static final int TUNNEL_MOVEMENT = 30;
    static final String FINISH_SYMBOL = "F";
    static final String TUNNEL_SYMBOL = "T";
    static final String REGULAR_SYMBOL = ".";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int carRow = 0;
        int carCol = 0;

        int N = Integer.parseInt(scanner.nextLine());
        String racingNum = scanner.nextLine();

        String[][] raceTrack = new String[N][N];
        fillMatrix(raceTrack, scanner);

        String command = scanner.nextLine();
        int coveredKm = 0;
        boolean isFinished = false;

        while (!command.equals("End")) {

            //check if we are at the FINISHLINE
            if (isThisSymbol(raceTrack, carRow, carCol, FINISH_SYMBOL)) {
                coveredKm += REGULAR_MOVEMENT;
                isFinished = true;
                break;
            }

            // move positions
            switch (command) {
                case "left":
                    carCol--;
                    break;
                case "right":
                    carCol++;
                    break;
                case "up":
                    carRow--;
                    break;
                case "down":
                    carRow++;
                    break;
            }

            String currentSym = raceTrack[carRow][carCol];
            if (currentSym.equals(TUNNEL_SYMBOL)) {
                int[] rowCol = findEndOfTunnel(raceTrack, carRow, carCol);
                carRow = rowCol[0];
                carCol = rowCol[1];
                coveredKm += TUNNEL_MOVEMENT;
            } else if (currentSym.equals(REGULAR_SYMBOL)) {
                coveredKm += REGULAR_MOVEMENT;
            }


            command = scanner.nextLine();
        }

        raceTrack[carRow][carCol] = "C";

        //PRINT
        if (!isFinished) {
            System.out.printf("Racing car %s DNF.%n", racingNum);
        } else {
            System.out.printf("Racing car %s finished the stage!%n", racingNum);
        }

        System.out.printf("Distance covered %d km.%n", coveredKm);
        printMatrix(raceTrack);


    }

    private static int[] findEndOfTunnel(String[][] matrix, int row, int col) {
        matrix[row][col] = REGULAR_SYMBOL;
        int[] rowCol = new int[2];
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[0].length; c++) {
                if (matrix[r][c].equals(TUNNEL_SYMBOL)) {
                    rowCol[0] = r;
                    rowCol[1] = c;
                    matrix[r][c] = REGULAR_SYMBOL;
                    break;
                }
            }
        }

        return rowCol;
    }

    private static boolean isThisSymbol(String[][] matrix, int row, int col, String symbol) {
        int searchedRow = -1;
        int searchedCol = -1;

        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[0].length; c++) {
                if (matrix[r][c].equals(symbol)) {
                    searchedRow = r;
                    searchedCol = c;
                }
            }
        }
        return searchedRow == row && searchedCol == col;
    }

    private static void fillMatrix(String[][] matrix, Scanner scanner) {
        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = scanner.nextLine().split(SPLIT_REGEX);
        }
    }

    private static void printMatrix(String[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }
    }


}
