package e05_WhileLoop;

import java.util.Scanner;

public class E03_Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double moneyVacation = Double.parseDouble(scanner.nextLine());
        double moneyOnHand = Double.parseDouble(scanner.nextLine());

        int spendCounter = 0;
        int days = 0;
        boolean saveFailed = false;


        while (moneyVacation>moneyOnHand) {

            days++;
            String action = scanner.nextLine();
            double actionMoney = Double.parseDouble(scanner.nextLine());

            if (action.equals("spend")) {
                moneyOnHand -= actionMoney;
                spendCounter++;

                if (moneyOnHand < 0) {
                    moneyOnHand = 0.0;
                }
                if (spendCounter == 5) {
                    saveFailed = true;
                    break;
                }
            } else {
                moneyOnHand += actionMoney;
                spendCounter = 0;
            }

        }


        if (saveFailed) {
            System.out.printf("You can't save the money.\n%d", days);
        } else {
            System.out.printf("You saved the money for %d days.", days);
        }

    }
}
