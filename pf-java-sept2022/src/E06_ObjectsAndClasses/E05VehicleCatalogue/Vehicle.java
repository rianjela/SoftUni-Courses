package E06_ObjectsAndClasses.E05VehicleCatalogue;

public class Vehicle {
    private String typeOfVehicle;
    private String model;
    private String color;
    double horsepower;


    public Vehicle(String typeOfVehicle, String model, String color, double horsepower) {
        this.typeOfVehicle = typeOfVehicle;
        this.model = model;
        this.color = color;
        this.horsepower = horsepower;
    }

    public String getTypeOfVehicle() {
        return typeOfVehicle;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public double getHorsepower() {
        return horsepower;
    }

    @Override
    public String toString() {
        return String.format("Type: %s\n" +
                "Model: %s\n" +
                "Color: %s\n" +
                "Horsepower: %.0f",
                typeOfVehicle, model, color, horsepower);
    }
}
