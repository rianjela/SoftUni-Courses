package E06_ObjectsAndClasses.E04_RawData;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());

        List<Car> flammableCarsList = new ArrayList<>();
        List<Car> fragileCarsList = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String[] carInfo = scanner.nextLine().split("\\s+");

            String model = carInfo[0];
            int engineSpeed = Integer.parseInt(carInfo[1]);
            int enginePower = Integer.parseInt(carInfo[2]);
            int cargoWeight = Integer.parseInt(carInfo[3]);
            String cargoType = carInfo[4];

            List<Tire> currentTires = new ArrayList<>();

            // creating a list for the current tires of the current car
            for (int j = 0; j < 4 * 2; j += 2) {
                currentTires.add(new Tire(Double.parseDouble(carInfo[5 + j]), Integer.parseInt(carInfo[5 + j + 1])));
            }

            // flammable or fragile list
            if (cargoType.equals("flamable")) {
                flammableCarsList.add(new Car(model, new Engine(engineSpeed, enginePower), new Cargo(cargoWeight, cargoType), currentTires));
            } else if (cargoType.equals("fragile")) {
                fragileCarsList.add(new Car(model, new Engine(engineSpeed, enginePower), new Cargo(cargoWeight, cargoType), currentTires));
            }

        } // for end

        String command = scanner.nextLine();

        switch (command) {
            case "fragile":
                printFragile(fragileCarsList);
                break;
            case "flamable":
                printFlamable(flammableCarsList);
                break;

        }


    }

    private static void printFlamable(List<Car> carsList) {
        for (Car car : carsList) {
            if (car.getEngine().getEnginePower() > 250) {
                System.out.println(car.getModel());
            }
        }
    }


    private static void printFragile(List<Car> carsList) {
        for (Car car : carsList) {
            List<Tire> currentTires = car.getTiresList();
            for (Tire tire : currentTires) {
                if (tire.getTirePressure() < 1) {
                    System.out.println(car.getModel());
                    break;
                }
            }
        }
    }


}
