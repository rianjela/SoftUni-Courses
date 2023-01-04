package ExamPrep;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FER03_03NeedForSpeedIII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int carsNumber = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> mileageMap = new LinkedHashMap<>();
        Map<String, Integer> fuelMap = new LinkedHashMap<>();

        for (int i = 0; i < carsNumber; i++) {
            String[] carDataArr = scanner.nextLine().split("\\|");
            String currentCar = carDataArr[0];
            int mileage = Integer.parseInt(carDataArr[1]);
            int fuel = Integer.parseInt(carDataArr[2]);

            mileageMap.put(currentCar, mileage);
            fuelMap.put(currentCar, fuel);
        }

        String[] command = scanner.nextLine().split("\\s+:\\s+");

        while (!command[0].equals("Stop")) {
            String car = command[1];
            switch (command[0]) {
                case "Drive":
                    int distance = Integer.parseInt(command[2]);
                    int fuelForTheRide = Integer.parseInt(command[3]);
                    int fuelHad = fuelMap.get(car);
                    if (fuelForTheRide > fuelHad) {
                        System.out.println("Not enough fuel to make that ride");
                    } else {
                        fuelMap.put(car, fuelMap.get(car) - fuelForTheRide);
                        mileageMap.put(car, mileageMap.get(car) + distance);
                        System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.\n", car, distance, fuelForTheRide);

                        if (mileageMap.get(car) > 100000) {
                            System.out.printf("Time to sell the %s!\n", car);
                            mileageMap.remove(car);
                            fuelMap.remove(car);
                        }
                    }
                    break;
                case "Refuel":
                    int refuelAmount = Integer.parseInt(command[2]);
                    int currentFuel = fuelMap.get(car);
                    if (currentFuel + refuelAmount > 75) {
                        refuelAmount = 75 - currentFuel;
                    }
                    fuelMap.put(car, currentFuel + refuelAmount);
                    System.out.printf("%s refueled with %d liters\n", car, refuelAmount);
                    break;
                case "Revert":
                    int kilometers = Integer.parseInt(command[2]);
                    int currentMileage = mileageMap.get(car);

                    if (currentMileage - kilometers < 10000) {
                        mileageMap.put(car, 10000);
                    } else {
                        mileageMap.put(car, currentMileage - kilometers);
                        System.out.printf("%s mileage decreased by %d kilometers\n", car, kilometers);
                    }
                    break;
            }
            command = scanner.nextLine().split("\\s+:\\s+");
        }

        for (Map.Entry<String, Integer> entry : mileageMap.entrySet()) {
            System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.\n", entry.getKey(),entry.getValue(), fuelMap.get(entry.getKey()));
        }


    }
}
