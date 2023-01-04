package L02_DataTypesAndVariables;

import java.util.Scanner;

public class L10_SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= num; i++) {

            int currentNum = i;
            int sum = 0;

            while (currentNum > 0) {
                int lastDigit = currentNum % 10;
                sum += lastDigit;
                currentNum = currentNum / 10;
            }

            if (sum == 5 || sum == 7 || sum == 11) {
                System.out.printf("%d -> True\n", i);
            } else {
                System.out.printf("%d -> False\n", i);

            }

        }
    }
}
