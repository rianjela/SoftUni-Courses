package e04_ForLoop;

import java.util.Scanner;

public class E08_TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int competitions = Integer.parseInt(scanner.nextLine());
        int pointsStart = Integer.parseInt(scanner.nextLine());
        int win = 0;
        int points =0;

        for (int i = 1; i <= competitions; i++) {

            String competitionStage = scanner.nextLine();

            switch (competitionStage) {
                case "W":
                    points += 2000;
                    win++;
                    break;
                case "F":
                    points += 1200;
                    break;
                case "SF":
                    points += 720;
                    break;
            }
        }


        System.out.printf("Final points: %d\n", points+pointsStart);
        System.out.printf("Average points: %.0f\n", (Math.floor(1.0 * points / competitions)));
        System.out.printf("%.2f%%", 1.0 * win / competitions * 100);
    }
}
