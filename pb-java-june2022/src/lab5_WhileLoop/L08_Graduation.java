package lab5_WhileLoop;

import java.util.Scanner;

public class L08_Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        int failedCounter = 0;
        int gradesCounter = 0;
        double sum = 0;
        boolean failed = false;

        while (gradesCounter < 12) {
            double grades = Double.parseDouble(scanner.nextLine());

            if (grades < 4) {
                failedCounter++;
                }

            if (failedCounter > 1) {
                failed = true;
                System.out.printf("%s has been excluded at %d grade", name, gradesCounter);
                break;
            }

            gradesCounter++;
            sum += grades;
        }
               if (!failed){
                System.out.printf("%s graduated. Average grade: %.2f", name, sum / 12);}

    }
}
