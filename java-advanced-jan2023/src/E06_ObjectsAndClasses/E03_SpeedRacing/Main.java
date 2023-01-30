package E06_ObjectsAndClasses.E03_SpeedRacing;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countCars = Integer.parseInt(scanner.nextLine());
        Map<String, Car> carMap = new LinkedHashMap<>();

        for (int i = 1; i <= countCars; i++) {
            String[] data = scanner.nextLine().split("\\s+");

            String model = data[0];
            double fuelAmount = Integer.parseInt(data[1]);
            double priceFuelPerKm = Double.parseDouble(data[2]);

            Car car = new Car(model, fuelAmount, priceFuelPerKm);
            carMap.put(model, car);
        }

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String carModelToDrive = input.split("\\s+")[1];
            int kmToDrive = Integer.parseInt(input.split("\\s+")[2]);

            Car carToDrive = carMap.get(carModelToDrive);
            // проверка дали имаме достатъчно гориво (в Car)
            if (!carToDrive.drive(kmToDrive)) {
                System.out.println("Insufficient fuel for the drive");
            }

            input = scanner.nextLine();
        }

        for (Car carCurrent : carMap.values()) {
            System.out.println(carCurrent.toString());
        }
    }
}
