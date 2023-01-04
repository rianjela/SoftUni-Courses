package exam_July2020;

import java.util.Scanner;

public class E05_BestPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();
        int goals = 0;
        int maxGoals = Integer.MIN_VALUE;
        boolean hatTrick = false;
        String bestPlayer = "";

        while (!input.equals("END")) {
            goals = Integer.parseInt(scanner.nextLine());


            if (goals > maxGoals) {
                maxGoals = goals;
                bestPlayer = input;
            }

            if (goals >= 10) {
                break;
            }

            input = scanner.nextLine();

        }
            if (maxGoals >= 3) {
                hatTrick = true;
            }

        System.out.printf("%s is the best player!\n", bestPlayer);
        if (hatTrick) {
            System.out.printf("He has scored %d goals and made a hat-trick !!!", maxGoals);
        } else {
            System.out.printf("He has scored %d goals.", maxGoals);
        }

    }
}
