package exam_July2020;

import java.util.Scanner;

public class E04_Balls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ballsCount = Integer.parseInt(scanner.nextLine());
        String ballColor = "";
        double points = 0;
        int redCount = 0;
        int orangeCount = 0;
        int yellowCount = 0;
        int whiteCount = 0;
        int blackCount = 0;
        int othersCount = 0;

        for (int i = 0; i < ballsCount; i++) {
            ballColor = scanner.nextLine();

            switch (ballColor) {
                case "red":
                    points += 5;
                    redCount++;
                    break;
                case "orange":
                    points += 10;
                    orangeCount++;
                    break;
                case "yellow":
                    points += 15;
                    yellowCount++;
                    break;
                case "white":
                    points += 20;
                    whiteCount++;
                    break;
                case "black":
                    points = Math.floor(points / 2);
                    blackCount++;
                    break;
                default:
                    othersCount++;
                    break;

            }

        }

        System.out.printf("Total points: %.0f\n", points);
        System.out.printf("Red balls: %d\n", redCount);
        System.out.printf("Orange balls: %d\n", orangeCount);
        System.out.printf("Yellow balls: %d\n", yellowCount);
        System.out.printf("White balls: %d\n", whiteCount);
        System.out.printf("Other colors picked: %d\n", othersCount);
        System.out.printf("Divides from black balls: %d", blackCount);
    }
}
