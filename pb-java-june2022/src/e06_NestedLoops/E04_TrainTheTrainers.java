package e06_NestedLoops;

import java.util.Scanner;

public class E04_TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        double allGrades = 0;
        int counter = 0;

        int juryCount = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        while (!input.equals("Finish")) {
            counter++;

            double grade = Double.parseDouble(scanner.nextLine());
            sum += grade;

            for (int i = 1; i < juryCount; i++) {
                grade = Double.parseDouble(scanner.nextLine());
                sum += grade;
            }

            System.out.printf("%s - %.02f.\n", input, sum / juryCount);
            allGrades += sum/juryCount;

            grade = 0;
            sum = 0;
            input = scanner.nextLine();
        }

        System.out.printf("Student's final assessment is %.2f.", allGrades / counter);
    }
}
