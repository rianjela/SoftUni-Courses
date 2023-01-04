package E06_ObjectsAndClasses.E05VehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Vehicle> carsList = new ArrayList<>();
        List<Vehicle> trucksList = new ArrayList<>();

        String[] input = scanner.nextLine().split(" ");

        while (!input[0].equals("End")) {
            switch (input[0]) {
                case "car":
                    carsList.add(new Vehicle("Car", input[1], input[2], Double.parseDouble(input[3])));
                    break;
                case "truck":
                    trucksList.add(new Vehicle("Truck", input[1], input[2], Double.parseDouble(input[3])));
                    break;
            }

            input = scanner.nextLine().split(" ");
        }
        String modelToPrint = scanner.nextLine();

        while (!modelToPrint.equals("Close the Catalogue")) {
            for (Vehicle car : carsList) {
                if (car.getModel().equals(modelToPrint)) {
                    System.out.println(car);
                }
            }
            for (Vehicle truck : trucksList) {
                if (truck.getModel().equals(modelToPrint)) {
                    System.out.println(truck);
                }
            }

            modelToPrint = scanner.nextLine();
        }
        double horsepowerCarsSum = 0;
        double horsepowerTrucksSum = 0;

        for (Vehicle car : carsList) {
            horsepowerCarsSum += car.getHorsepower();
        }
        for (Vehicle truck : trucksList) {
            horsepowerTrucksSum += truck.getHorsepower();

        }


        double avgHorsepowerCars = 0;
        double avgHorsepowerTrucks = 0;

        if (!carsList.isEmpty()) {
            avgHorsepowerCars = horsepowerCarsSum / carsList.size();
        }

        if (!trucksList.isEmpty()) {
            avgHorsepowerTrucks = horsepowerTrucksSum / trucksList.size();
        }

        System.out.printf("Cars have average horsepower of: %.2f.\n", avgHorsepowerCars);
        System.out.printf("Trucks have average horsepower of: %.2f.", avgHorsepowerTrucks);

    }
}
