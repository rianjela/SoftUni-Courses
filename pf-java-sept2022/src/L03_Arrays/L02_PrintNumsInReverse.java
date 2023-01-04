package L03_Arrays;

import java.util.Scanner;

public class L02_PrintNumsInReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbersCount = Integer.parseInt(scanner.nextLine());

        int[] numbersArr = new int[numbersCount];

        for (int i = 0; i < numbersCount; i++) {
            numbersArr[i] = Integer.parseInt(scanner.nextLine());
        }

        for (int i = numbersArr.length - 1; i >= 0; i--) {
            System.out.print(numbersArr[i] + " ");

        }


    }
}
