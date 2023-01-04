package L03_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class L05_EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int sumOdd = 0;
        int sumEven = 0;
        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] % 2 == 0) {
                sumEven += numbers[i];
            } else {
                sumOdd += numbers[i];
            }

        }
        System.out.println(sumEven - sumOdd);
    }
}
