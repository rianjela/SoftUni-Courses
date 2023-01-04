package E02_DataTypesАndVariables;

import java.util.Scanner;

public class E08_BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int kegCount = Integer.parseInt(scanner.nextLine());
        String biggestKeg = "";
        double maxVolume = Double.MIN_VALUE;


        for (int i = 1; i <= kegCount; i++) {
            String modelOfKeg = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double volume = Math.PI * Math.pow(radius, 2) * height;

            if (volume > maxVolume) {
                maxVolume = volume;
                biggestKeg = modelOfKeg;
            }
        }

        System.out.println(biggestKeg);
    }
}
