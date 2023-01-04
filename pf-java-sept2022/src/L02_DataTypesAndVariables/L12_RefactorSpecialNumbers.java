package L02_DataTypesAndVariables;

import java.util.Scanner;

public class L12_RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        boolean isSpecialNum;

        for (int i = 1; i <= n; i++) {

        int sum = 0;
        int currentNum = i;

            while (currentNum > 0) {
                sum += currentNum % 10;
                currentNum = currentNum / 10;
            }

            isSpecialNum = (sum == 5) || (sum == 7) || (sum == 11);
            String booleanValue = String.valueOf(isSpecialNum);
            booleanValue = booleanValue.substring(0, 1).toUpperCase() + booleanValue.substring(1);
            System.out.printf("%d -> %s%n", i, booleanValue);
        }

    }
}
