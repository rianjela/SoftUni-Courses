package E01_WorkingWithAbstraction.E04_TrafficLights;

public class TrafficLight {


    public enum Signal {
        RED,
        GREEN,
        YELLOW;

    }


    private Signal signal;

    public TrafficLight(Signal signal) {
        this.signal = signal;
    }

    public void update() {
        switch (this.signal) {
            case RED:
                this.signal = Signal.GREEN;
                break;
            case GREEN:
                this.signal = Signal.YELLOW;
                break;
            case YELLOW:
                this.signal = Signal.RED;
                break;
        }
    }

    public Signal getSignal() {
        return signal;
    }
}
