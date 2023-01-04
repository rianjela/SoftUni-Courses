package ExamMiddlePrep;

import java.util.Scanner;

public class l01_GuineaPig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double foodBoughtKg = Double.parseDouble(scanner.nextLine());
        double hayBoughtKg = Double.parseDouble(scanner.nextLine());
        double coverBoughtKg = Double.parseDouble(scanner.nextLine());
        double weightPuppyKg = Double.parseDouble(scanner.nextLine());

        double foodGr = foodBoughtKg * 1000;
        double hayGr = hayBoughtKg * 1000;
        double coverGr = coverBoughtKg * 1000;
        double weightGr = weightPuppyKg * 1000;
        boolean enoughQuantities = true;

        for (int i = 1; i <= 30; i++) {
            foodGr -= 300;
            if (i % 2 == 0) {
                hayGr -= foodGr * 5 / 100;
            }
            if (i % 3 == 0) {
                coverGr -= weightGr / 3;
            }

            if (foodGr <= 0 || hayGr <= 0 || coverGr <= 0) {
                System.out.println("Merry must go to the pet store!");
                enoughQuantities = false;
                break;
            }
        }

        if (enoughQuantities) {
            System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.", foodGr / 1000, hayGr / 1000, coverGr / 1000);
        }
    }
}
