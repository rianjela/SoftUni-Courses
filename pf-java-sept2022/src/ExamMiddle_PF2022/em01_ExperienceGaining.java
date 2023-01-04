package ExamMiddle_PF2022;

import java.util.Scanner;

public class em01_ExperienceGaining {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double neededXP = Double.parseDouble(scanner.nextLine());
        int battlesCount = Integer.parseInt(scanner.nextLine());

        boolean xpIsEnough = false;
        double collectedXP = 0;
        int battleCount = 0;

        for (int i = 1; i <= battlesCount; i++) {
            double xpPerBattle = Double.parseDouble(scanner.nextLine());
            battleCount = i;

            if (battleCount % 15 == 0) {
                collectedXP += xpPerBattle + xpPerBattle * 5 / 100;
            } else if (battleCount % 5 == 0) {
                collectedXP += xpPerBattle - xpPerBattle * 10 / 100;
            } else if (battleCount % 3 == 0) {
                collectedXP += xpPerBattle + xpPerBattle * 15 / 100;
            } else {
                collectedXP += xpPerBattle;
            }

            if (collectedXP >= neededXP) {
                xpIsEnough = true;
                break;

            }
        }

        if (collectedXP >= neededXP) {
            xpIsEnough = true;
        } else {
            xpIsEnough = false;
        }

        if (xpIsEnough) {
            System.out.printf("Player successfully collected his needed experience for %d battles.", battleCount);
        } else {
            System.out.printf("Player was not able to collect the needed experience, %.2f more needed.", Math.abs(neededXP - collectedXP));
        }


    }
}
