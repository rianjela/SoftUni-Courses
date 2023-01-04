package L02_DataTypesAndVariables;

import java.util.Scanner;

public class L01_ConvertMetersToKilometers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int meters = Integer.parseInt(scanner.nextLine());
        double km = meters / 1000.0;

        String output = String.format("%.2f", km);

        System.out.println(output);
    }
}
