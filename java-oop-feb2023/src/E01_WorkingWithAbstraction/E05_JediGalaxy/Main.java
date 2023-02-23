package E01_WorkingWithAbstraction.E05_JediGalaxy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[][] galaxyMatrix = readAndInitializeMatrix(scanner);

        String command = scanner.nextLine();
        long sum = 0;
        while (!command.equals("Let the Force be with you")) {
            int[] jediCoordsArr = Arrays.stream(command.split(" ")).mapToInt(Integer::parseInt).toArray();
            int[] evilCoords = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            sum += calculateSum(galaxyMatrix, jediCoordsArr, evilCoords);

            command = scanner.nextLine();
        }

        System.out.println(sum);

    }

    private static long calculateSum(int[][] galaxyMatrix, int[] jediCoords, int[] evilCoords) {
        moveEvilAndDestroyStars(galaxyMatrix, evilCoords);
        long sum = moveJediAndCalculateStars(galaxyMatrix, jediCoords);

        return sum;
    }

    private static long moveJediAndCalculateStars(int[][] galaxyMatrix, int[] jediCoords) {
        int jediRow = jediCoords[0];
        int jediCol = jediCoords[1];

        long sum = 0;
        while (canJediStillMove(galaxyMatrix, jediRow, jediCol)) {

            boolean isInMatrix = isInMatrix(jediRow, galaxyMatrix, jediCol);
            if (isInMatrix) {
                sum += galaxyMatrix[jediRow][jediCol];
            }

            jediRow--;
            jediCol++;
        }
        return sum;
    }

    private static boolean isInMatrix(int jediRow, int[][] galaxyMatrix, int jediCol) {
        return jediRow >= 0 && jediRow < galaxyMatrix.length && jediCol >= 0 && jediCol < galaxyMatrix[0].length;
    }


    private static boolean canJediStillMove(int[][] galaxyMatrix, int jediRow, int jediCol) {
        return jediRow >= 0 && jediCol < galaxyMatrix[1].length;
    }


    private static boolean canEvilStillMove(int evilRow, int evilCol) {
        return evilRow >= 0 && evilCol >= 0;
    }

    private static void moveEvilAndDestroyStars(int[][] galaxyMatrix, int[] evilCoords) {
        int evilRow = evilCoords[0];
        int evilCol = evilCoords[1];

        while (canEvilStillMove(evilRow, evilCol)) {
            boolean isInMatrix = isInMatrix(evilRow, galaxyMatrix, evilCol);
            if (isInMatrix) {
                galaxyMatrix[evilRow][evilCol] = 0;
            }
            evilRow--;
            evilCol--;
        }
    }

    private static int[][] readAndInitializeMatrix(Scanner scanner) {
        int[] dimensions = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int x = dimensions[0];
        int y = dimensions[1];

        int[][] matrix = new int[x][y];

        int value = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                matrix[i][j] = value++;
            }
        }
        return matrix;
    }
}

