package E03_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class e08_MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] numbersArray = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sumNumber = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numbersArray.length; i++) {

            for (int j = i + 1; j < numbersArray.length; j++) {

                int sum = numbersArray[i] + numbersArray[j];

                if (sum == sumNumber) {
                    System.out.println (numbersArray[i] + " " + numbersArray[j]);
                }

            }

        }

    }
}
