package L02_DataTypesAndVariables;

import java.math.BigDecimal;
import java.util.Scanner;

public class L03_ExactSumOfRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbersAmount = Integer.parseInt(scanner.nextLine());
        BigDecimal sum = new BigDecimal(0);

        for (int i = 1; i <= numbersAmount ; i++) {

            BigDecimal number = new BigDecimal(scanner.nextLine());
            sum = sum.add(number);

        }

        System.out.println(sum);
    }

}
