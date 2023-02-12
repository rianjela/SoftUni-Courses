package E06_ObjectsAndClasses.E04_RawData;


import java.util.List;

public class Car {
    private static final int INITIAL_VALUE = 0;

    private String model;
    private Engine engine;
    private Cargo cargo;
    private List<Tire> tiresList;

    // Constructor
    public Car(String model, Engine engine, Cargo cargo, List<Tire> tiresMap) {
        this.model = model;
        this.engine = engine;
        this.cargo = cargo;
        this.tiresList = tiresMap;

    }

    public List<Tire> getTiresList() {
        return tiresList;
    }

    //Getters & Setters
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }



}
