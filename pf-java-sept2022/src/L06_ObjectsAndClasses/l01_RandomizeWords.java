package L06_ObjectsAndClasses;

import java.util.Random;
import java.util.Scanner;

public class l01_RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        Random random = new Random();

        for (int i = 0; i <= input.length - 1; i++) {
            int index2 = random.nextInt(input.length);

            String inputIndex1 = input[i];
            String inputIndex2 = input[index2];

            input[i] = inputIndex2;
            input[index2] = inputIndex1;

        }


        for (String word : input) {
            System.out.println(word);
        }

    }
}
