package E06_ObjectsAndClasses.E03_SpeedRacing;

public class Car {

    // характеристики
    private String model;
    private double fuelAmount;
    private double consumptionFuelPerKm;
    private int distanceTraveled;

    // методи - действия

    //констриктур
    public Car(String model, double fuelAmount, double priceFuelPerKm) {
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.consumptionFuelPerKm = priceFuelPerKm;
        this.distanceTraveled = 0;
    }

    public boolean drive(int kmDrive) {
        // количество гориво, за да се преминат съответните км
        double neededFuel = kmDrive * this.consumptionFuelPerKm;
        if (neededFuel <= this.fuelAmount) {
            this.fuelAmount -= neededFuel;
            this.distanceTraveled += kmDrive;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return String.format("%s %.2f %d", this.model, this.fuelAmount, this.distanceTraveled);
    }

}
