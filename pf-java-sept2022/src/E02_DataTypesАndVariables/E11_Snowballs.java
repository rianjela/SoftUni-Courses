package E02_DataTypesАndVariables;

import java.util.Scanner;

public class E11_Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int snowballsNumber = Integer.parseInt(scanner.nextLine());
        double snowballValue = 0;
        double highestValue = Double.MIN_VALUE;
        String output = "";

        for (int i = 1; i <= snowballsNumber; i++) {

            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());

            snowballValue = Math.pow((1.0 * snowballSnow / snowballTime), snowballQuality);

            if (snowballValue > highestValue){
                highestValue = snowballValue;
                output = String.format("%d : %d = %.0f (%d)", snowballSnow, snowballTime, snowballValue, snowballQuality);
            }
        }
        System.out.print(output);

    }

}
