package Exam_18Feb2023;

import java.util.Arrays;
import java.util.Scanner;

public class E02_BlindMansBuff {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] matrixDimensions = Arrays
                .stream(scanner.nextLine().trim().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int N = matrixDimensions[0];
        int M = matrixDimensions[1];

        String[][] playgroundMatrix = new String[N][M];

        fillMatrix(playgroundMatrix, scanner);

        int[] positionPlayer = findPlayerOnPlayground(playgroundMatrix);
        int rowPlayer = positionPlayer[0];
        int colPlayer = positionPlayer[1];


        String command = scanner.nextLine();
        int movesCount = 0;
        int touchedOpponents = 0;


        while (!command.contains("Finish")) {

            //MOVING
            if (isObstacle(rowPlayer, colPlayer, playgroundMatrix)) {
                command = scanner.nextLine();
                continue;
            } else {
                switch (command) {

                    case "up":
                        if (rowPlayer > 0 && !isObstacle(rowPlayer - 1, colPlayer, playgroundMatrix)) {
                            rowPlayer--;
                            movesCount++;
                        }
                        break;
                    case "down":
                        if (rowPlayer < playgroundMatrix.length - 1 && !isObstacle(rowPlayer + 1, colPlayer, playgroundMatrix)) {
                            rowPlayer++;
                            movesCount++;
                        }
                        break;
                    case "right":
                        if (colPlayer < playgroundMatrix[0].length - 1 && !isObstacle(rowPlayer, colPlayer + 1, playgroundMatrix)) {
                            colPlayer++;
                            movesCount++;
                        }
                        break;
                    case "left":
                        if (colPlayer > 0 && !isObstacle(rowPlayer, colPlayer - 1, playgroundMatrix)) {
                            colPlayer--;
                            movesCount++;
                        }
                        break;
                }
            }

            if (isOpponent(rowPlayer, colPlayer, playgroundMatrix)) {
                playgroundMatrix[rowPlayer][colPlayer] = "-";
                touchedOpponents++;
            }

            if (touchedOpponents == 3) {
                break;
            }


            command = scanner.nextLine();
        }

        System.out.println("Game over!");
        System.out.printf("Touched opponents: %d Moves made: %d", touchedOpponents, movesCount);

    }

    private static boolean isOpponent(int row, int col, String[][] matrix) {
        return matrix[row][col].equals("P");
    }

    private static boolean isObstacle(int row, int col, String[][] matrix) {
        return matrix[row][col].equals("O");
    }

    private static int[] findPlayerOnPlayground(String[][] matrix) {
        int[] rowColData = new int[2];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                if (matrix[row][col].equals("B")) {
                    rowColData[0] = row;
                    rowColData[1] = col;
                }
            }
        }

        return rowColData;
    }

    private static void fillMatrix(String[][] matrix, Scanner scanner) {
        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = scanner.nextLine().split("\\s+");
        }
    }

}
