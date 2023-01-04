package e04_ForLoop;

import java.util.Scanner;

public class E07_TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groups = Integer.parseInt(scanner.nextLine());
        int peopleAll = 0;
        int Musala = 0;
        int Montblanc = 0;
        int Kilimandzaro = 0;
        int K2 = 0;
        int Everest = 0;


        for (int i = 1; i <= groups; i++) {
            int people = Integer.parseInt(scanner.nextLine());
            peopleAll += people;


            if (people <= 5) {
                Musala += people;
            } else if (people <= 12) {
                Montblanc += people;
            } else if (people <= 25) {
                Kilimandzaro += people;
            } else if (people <= 40) {
                K2 += people;
            } else {
                Everest += people;
            }

        }

        System.out.printf("%.02f%%\n", 1.0 * Musala / peopleAll * 100);
        System.out.printf("%.02f%%\n", 1.0 * Montblanc / peopleAll * 100);
        System.out.printf("%.02f%%\n", 1.0 * Kilimandzaro / peopleAll * 100);
        System.out.printf("%.02f%%\n", 1.0 * K2 / peopleAll * 100);
        System.out.printf("%.02f%%", 1.0 * Everest / peopleAll * 100);
    }
}
