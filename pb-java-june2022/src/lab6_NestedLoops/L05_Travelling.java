package lab6_NestedLoops;

import java.util.Scanner;

public class L05_Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double minBudget = 0;
        double savedMoney = 0;
        String destination = "";

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            destination = input;
            input = scanner.nextLine();
            minBudget = Double.parseDouble(input);

            while (savedMoney < minBudget) {
                input = scanner.nextLine();
                savedMoney += Double.parseDouble(input);

                if (savedMoney >= minBudget) {
                    System.out.printf("Going to %s!\n", destination);
                    savedMoney = 0;
                    break;
                }

            }

            input = scanner.nextLine();

        }

    }
}

