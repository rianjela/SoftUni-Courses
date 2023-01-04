package e02_ConditionalStatements;

import java.util.Scanner;

public class LunchBreak_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String tvSeries = scanner.nextLine();
        int timeEpisode = Integer.parseInt(scanner.nextLine());
        int timeBreak = Integer.parseInt(scanner.nextLine());

        double timeLunch = timeBreak/8.0;
        double timeRest = timeBreak/4.0;


        double timeLeft = timeBreak-timeLunch-timeRest;

        if(timeLeft>=timeEpisode){
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", tvSeries, Math.ceil(timeLeft-timeEpisode));
        } else{
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.",tvSeries,Math.ceil(timeEpisode-timeLeft));
        }

    }
}
