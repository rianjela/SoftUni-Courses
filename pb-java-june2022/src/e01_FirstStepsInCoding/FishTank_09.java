package e01_FirstStepsInCoding;

import java.util.Scanner;

public class FishTank_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lenght = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percentage = Double.parseDouble(scanner.nextLine());

        int cmVolume = lenght * width * height;

        double literVolume = cmVolume/1000.00 - (cmVolume/1000.00*percentage/100);

        System.out.println(literVolume);

    }
}
