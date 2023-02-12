package E06_ObjectsAndClasses.E04_RawData;

public class Tire {

    // {Tire1Pressure} {Tire1Age}
    // {Tire2Pressure} {Tire2Age}
    // {Tire3Pressure} {Tire3Age}
    // {Tire4Pressure} {Tire4Age}

    private double tirePressure;
    private int tireAge;

    public double getTirePressure() {
        return tirePressure;
    }

    public void setTirePressure(double tirePressure) {
        this.tirePressure = tirePressure;
    }

    public int getTireAge() {
        return tireAge;
    }

    public void setTireAge(int tireAge) {
        this.tireAge = tireAge;
    }

    public Tire(double tirePressure, int tireAge) {
        this.tirePressure = tirePressure;
        this.tireAge = tireAge;

    }




}
