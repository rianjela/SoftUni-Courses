package E02_DataTypesАndVariables;

import java.util.Scanner;

public class E07_WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pouringCount = Integer.parseInt(scanner.nextLine());
        int littersInTank = 0;

        for (int i = 1; i <= pouringCount; i++) {
            int littersToAdd = Integer.parseInt(scanner.nextLine());

            if (littersToAdd + littersInTank > 255) {
                System.out.println("Insufficient capacity!");
            } else {
            littersInTank += littersToAdd;
            }
        }

        System.out.println(littersInTank);

    }
}
