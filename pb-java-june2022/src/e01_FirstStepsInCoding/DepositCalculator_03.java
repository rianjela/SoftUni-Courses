package e01_FirstStepsInCoding;

import java.util.Scanner;

public class DepositCalculator_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double depositSum = Double.parseDouble(scanner.nextLine());
        int months = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        double finalSum = depositSum + months * ((depositSum * percent / 100) / 12);

        System.out.println(finalSum);


    }
}
