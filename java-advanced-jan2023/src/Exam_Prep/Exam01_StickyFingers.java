package Exam_Prep;

import java.util.Scanner;

public class Exam01_StickyFingers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        String[] directions = scanner.nextLine().split(",");

        String[][] matrix = new String[size][size];

        fillMatrix(matrix, scanner);

        int rowThief = -1;
        int colThief = -1;

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {

                if (matrix[row][col].equals("D")) {
                    rowThief = row;
                    colThief = col;
                    break;
                }
            }
        }

        int totalStolenMoney = 0;
        for (String direction : directions) {

            switch (direction) {
                case "left":
                    if (colThief - 1 < 0) {
                        System.out.println("You cannot leave the town, there is police outside!");
                    } else {
                        matrix[rowThief][colThief] = "+";
                        colThief--;
                    }
                    break;
                case "right":
                    if (colThief + 1 >= size) {
                        System.out.println("You cannot leave the town, there is police outside!");
                    } else {
                        matrix[rowThief][colThief] = "+";
                        colThief++;
                    }
                    break;
                case "up":
                    if (rowThief - 1 < 0) {
                        System.out.println("You cannot leave the town, there is police outside!");
                    } else {
                        matrix[rowThief][colThief] = "+";
                        rowThief--;
                    }
                    break;
                case "down":
                    if (rowThief + 1 >= size) {
                        System.out.println("You cannot leave the town, there is police outside!");
                    } else {
                        matrix[rowThief][colThief] = "+";
                        rowThief++;
                        break;
                    }
            }


            String currentPosition = matrix[rowThief][colThief];
            if (currentPosition.equals("$")) {
                int stolenMoney = rowThief * colThief;
                totalStolenMoney += stolenMoney;
                System.out.printf("You successfully stole %d$.%n", stolenMoney);
                matrix[rowThief][colThief] = "D";
            } else if (currentPosition.equals("P")) {
                System.out.printf("You got caught with %d$, and you are going to jail.%n", totalStolenMoney);
                matrix[rowThief][colThief] = "#";
                printMatrix(matrix);
                return;
            } else if (currentPosition.equals("+")) {
                matrix[rowThief][colThief] = "D";
            }


        }

        System.out.printf("Your last theft has finished successfully with %d$ in your pocket.%n", totalStolenMoney);
        printMatrix(matrix);
    }

    private static void printMatrix(String[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println(); //свали курсора на следващия ред
        }
    }

    private static void fillMatrix(String[][] matrix, Scanner scanner) {
        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = scanner.nextLine().split("\\s+");
        }
    }
}
