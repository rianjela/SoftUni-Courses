package e05_WhileLoop;

import java.util.Scanner;

public class E02_ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int poorGrades = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        boolean needBreak = false;
        int grades = 0;
        int poorGradesCounter = 0;
        int allGradesCounter = 0;
        double sumGrades = 0;
        String lastProblem = "";


        while (!input.equals("Enough")) {
            lastProblem = input;

            input = scanner.nextLine();
            grades = Integer.parseInt(input);
            allGradesCounter++;
            sumGrades += grades;

            if (grades <= 4) {
                poorGradesCounter++;
            }

            if (poorGradesCounter == poorGrades) {
                needBreak = true;
                break;
            }

            input = scanner.nextLine();
        }

        if (needBreak) {
            System.out.printf("You need a break, %d poor grades.", poorGradesCounter);
        } else {
            System.out.printf("Average score: %.2f\nNumber of problems: %d\nLast problem: %s",
                    (sumGrades / allGradesCounter), allGradesCounter, lastProblem);
        }

    }
}
