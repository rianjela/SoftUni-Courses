package E02_DataTypesАndVariables;

import java.util.Scanner;

public class E10_PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pokePower = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        int exhaustionFactor = Integer.parseInt(scanner.nextLine());
        int pokeCounter = 0;

        double halfPower = 1.0 * pokePower * 50 / 100;

        while (pokePower >= distance) {

            pokePower -= distance;
            pokeCounter++;

            if (pokePower == halfPower) {
                if (exhaustionFactor != 0) {
                    pokePower = pokePower / exhaustionFactor;
                }
            }

        }

        System.out.println(pokePower);
        System.out.println(pokeCounter);
    }
}
