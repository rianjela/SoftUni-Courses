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

        char[][] matrix = new char[rowsCounter][maxLength];
        fillMatrixWithList(matrix, wordsList);

        //rotation of the matrix / (rotationDegrees / 90 % 4)
        int rotationSteps = degreesRotation / 90 % 4;

        // System.out.println();

    }

    //fill the matrix with values from the list with the words (+ " ");
    private static void fillMatrixWithList(char[][] matrix, List<String> list) {

        for (int row = 0; row < list.size(); row++) {
            char[] currentWordArr = list.get(row).toCharArray();
            //if the longest word
            for (int col = 0; col < currentWordArr.length; col++) {
                matrix[row][col] = currentWordArr[col];
            }

            //if not the longest word - needs " " at the end
            if (currentWordArr.length < matrix[0].length) {
                for (int col = currentWordArr.length; col < matrix[0].length; col++) {
                    matrix[row][col] = ' ';
                }
            }

        }
    }


}
