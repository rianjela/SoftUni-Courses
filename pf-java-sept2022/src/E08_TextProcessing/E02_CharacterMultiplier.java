package E08_TextProcessing;

import java.util.Scanner;

public class E02_CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArr = scanner.nextLine().split("\\s+");

        String firstStr = inputArr[0];
        String secondStr = inputArr[1];
        int sum = 0;

        if (firstStr.length() > secondStr.length()) {
           sum = sumMultiplications(firstStr, secondStr);

        } else {
            sum = sumMultiplications(secondStr, firstStr);
        }


        System.out.println(sum);
    }

    private static int sumMultiplications(String longerString, String shorterString) {

        int sum = 0;

        for (int i = 0; i < shorterString.length(); i++) {
            int multiply = longerString.toCharArray()[i] * shorterString.toCharArray()[i];
            sum += multiply;
        }

        for (int i = shorterString.length(); i < longerString.length(); i++) {
            sum += longerString.toCharArray()[i];
        }

        return sum;
    }
}
