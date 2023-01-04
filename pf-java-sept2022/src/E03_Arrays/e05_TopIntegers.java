package E03_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class e05_TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] digits = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int currentNum = 0;

        for (int i = 0; i < digits.length; i++) {
            boolean topNum = true;
            currentNum = digits[i];

            for (int j = i + 1; j < digits.length; j++) {
                if (currentNum <= digits[j]) {
                    topNum = false;
                    break;
                }
            }

            if (topNum) {
                System.out.print(currentNum + " ");
            }

        }


    }

}





