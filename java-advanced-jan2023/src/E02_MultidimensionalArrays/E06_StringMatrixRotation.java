package E02_MultidimensionalArrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E06_StringMatrixRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String rotationInput = scanner.nextLine();

        //Extract rotation degrees from the input
        String regexDigits = "[0-9]+";
        Pattern pattern = Pattern.compile(regexDigits);
        Matcher matcher = pattern.matcher(rotationInput);
        int degreesRotation = 0;
        if (matcher.find()) {
            degreesRotation = Integer.parseInt(matcher.group());
        }

        List<String> wordsList = new ArrayList<>();
        int maxLength = Integer.MIN_VALUE;
        int rowsCounter = 0;

        String input = scanner.nextLine();

        //read words of the matrix
        while (!input.equals("END")) {
            //check for the longest word - columns count
            rowsCounter++;
            if (maxLength < input.length()) {
                maxLength = input.length();
            }

            wordsList.add(input);
            input = scanner.nextLine();
        }

        //rotation of the matrix / (rotationDegrees / 90 % 4)
        int rotationSteps = degreesRotation / 90 % 4;

        char[][] matrix;
        //fill matrix horizontally or vertically
        if (rotationSteps % 2 != 0) {
            matrix = new char[maxLength][rowsCounter];
            fillMatrixWithSpaces(matrix);
        } else {
            matrix = new char[rowsCounter][maxLength];
            fillMatrixWithSpaces(matrix);
        }

        //rotate and fill
        switch (rotationSteps) {
            case 1: // 90 degrees
                fillMatrix90Deg(matrix, wordsList);
                break;
            case 2: // 180 degrees
                fillMatrix180Deg(matrix, wordsList);
                break;
            case 3: // 270 degrees
                fillMatrix270Deg(matrix, wordsList);
                break;
            case 0: // 0 / 360 degrees
                fillMatrix0Deg(matrix, wordsList);
                break;
        }

        printMatrix(matrix);

    }

    // 0/360 degrees
    private static void fillMatrix0Deg(char[][] matrix, List<String> list) {
        for (int row = 0; row < matrix.length; row++) {
            char[] currentWordArr = list.get(row).toCharArray(); // думата на съответния ред
            for (int col = 0; col <= list.get(row).length() - 1; col++) {
                matrix[row][col] = currentWordArr[col];
            }
        }
    }


    // 270 degrees
    private static void fillMatrix270Deg(char[][] matrix, List<String> list) {
        for (int col = 0; col <= matrix[0].length - 1; col++) {
            char[] currentWordArr = list.get(col).toCharArray(); // думата на съответния ред
            int counterRows = 0;
            for (int row = matrix.length - 1; row >= matrix.length - list.get(col).length(); row--, counterRows++) {
                matrix[row][col] = currentWordArr[counterRows];
            }
        }
    }

    // 180 degrees
    private static void fillMatrix180Deg(char[][] matrix, List<String> list) {
        int counterRow = 0;
        for (int row = matrix.length - 1; row >= 0; row--, counterRow++) {
            char[] currentWordArr = list.get(counterRow).toCharArray(); // думата на съответния ред
            int counter = 0;
            for (int col = matrix[0].length - 1; col > matrix[0].length - 1 - list.get(counterRow).length(); col--, counter++) {
                matrix[row][col] = currentWordArr[counter];
            }
        }
    }

    // 90 degrees
    private static void fillMatrix90Deg(char[][] matrix, List<String> list) {
        int counter = 0;
        for (int col = matrix[0].length - 1; col >= 0; col--, counter++) {
            char[] currentWordArr = list.get(counter).toCharArray(); // думата на съответния ред
            for (int row = 0; row < list.get(counter).length(); row++) {
                matrix[row][col] = currentWordArr[row];
            }
        }
    }


    private static void printMatrix(char[][] matrix) {

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }
    }


    //fill the matrix with values from the list with the words (+ " ");
    private static void fillMatrixWithSpaces(char[][] matrix) {

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                matrix[row][col] = ' ';
            }
        }
    }

}
