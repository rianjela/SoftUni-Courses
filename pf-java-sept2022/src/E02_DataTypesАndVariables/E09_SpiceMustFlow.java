package E02_DataTypesАndVariables;

import java.util.Scanner;

public class E09_SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingYield = Integer.parseInt(scanner.nextLine());
        int yieldTotal = 0;
        int daysCounter = 0;

        while (startingYield >= 100) {
                yieldTotal += startingYield - 26;

            daysCounter++;
            startingYield -= 10;
        }

        if (yieldTotal >= 26) {

            yieldTotal -= 26;
        }

        System.out.println(daysCounter);
        System.out.println(yieldTotal);
    }
}
