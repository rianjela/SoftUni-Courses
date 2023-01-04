package e05_WhileLoop;

import java.util.Scanner;

public class E04_Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int goal = 10000;
        int steps = 0;
        int stepsSum = 0;
        boolean goingHome = false;
        int difference = 0;
        String input = "";


        while (stepsSum < goal) {

            input = scanner.nextLine();

            if (input.equals("Going home")){
                input = scanner.nextLine();
                steps = Integer.parseInt(input);
                stepsSum += steps;
                break;
            }

            steps = Integer.parseInt(input);
            stepsSum += steps;

        }

        difference = Math.abs(goal - stepsSum);

        if (stepsSum < goal) {
            System.out.printf("%d more steps to reach goal.", difference);
        } else {
            System.out.printf("Goal reached! Good job!\n%d steps over the goal!", difference);
        }

    }
}
