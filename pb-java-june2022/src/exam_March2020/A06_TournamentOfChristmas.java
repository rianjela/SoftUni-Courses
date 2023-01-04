package exam_March2020;

import java.util.Scanner;

public class A06_TournamentOfChristmas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysTournament = Integer.parseInt(scanner.nextLine());
        String input = "";

        int winCounter = 0;
        int loseCounter = 0;
        double moneyWon = 0;
        double totalRaisedMoney = 0;
        int winnerDays = 0;
        int looserDays = 0;

        for (int i = 1; i <= daysTournament; i++) {
            moneyWon = 0;
            input = scanner.nextLine();

            while (!input.equals("Finish")) {

                switch (input) {
                    case "win":
                        moneyWon += 20;
                        totalRaisedMoney +=20;
                        winCounter++;
                        break;
                    case "lose":
                        loseCounter++;
                        break;
                }

                input = scanner.nextLine();
            }

            if (winCounter > loseCounter) {
                totalRaisedMoney += moneyWon * 10 / 100;
                winnerDays++;
            } else {
                looserDays++;
            }

            winCounter = 0;
            loseCounter = 0;

        }

        if (winnerDays > looserDays) {
            totalRaisedMoney += totalRaisedMoney * 20 / 100;
            System.out.printf("You won the tournament! Total raised money: %.2f", totalRaisedMoney);
        } else {
            System.out.printf("You lost the tournament! Total raised money: %.2f", totalRaisedMoney);
        }
    }
}
