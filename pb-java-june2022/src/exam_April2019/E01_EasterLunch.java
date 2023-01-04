package exam_April2019;

import java.util.Scanner;

public class E01_EasterLunch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cakeCount = Integer.parseInt(scanner.nextLine());
        int eggsBoxCount = Integer.parseInt(scanner.nextLine());
        int cookiesKg = Integer.parseInt(scanner.nextLine());

        int eggsCount = 12 * eggsBoxCount;
        double eggsPrice = eggsBoxCount * 4.35;
        double cakePrice = cakeCount * 3.20;
        double cookiesPrice = cookiesKg * 5.4;
        double paintEggsPrice = eggsCount * 0.15;

        System.out.printf("%.2f", eggsPrice + cakePrice + paintEggsPrice + cookiesPrice);
    }
}
