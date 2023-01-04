package exam_July2022;

import java.util.Scanner;

public class E05_Everest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int metersTotal = 5364;
        int daysCounter = 1;

        boolean failed = false;

        String nightInside = scanner.nextLine();

        while (!nightInside.equals("END")) {

            if (nightInside.equals("Yes")) {
                daysCounter++;
            }

            if (daysCounter > 5) {
                break;
            }
            int metersClimbedPerDay = Integer.parseInt(scanner.nextLine());
            metersTotal += metersClimbedPerDay;

            if (metersTotal >= 8848) {
                break;
            }



            nightInside = scanner.nextLine();

        }


        if (metersTotal < 8848) {
            System.out.printf("Failed!\n%d", metersTotal);
        } else {
            System.out.printf("Goal reached for %d days!", daysCounter);
        }

    }
}
