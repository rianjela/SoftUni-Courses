package E01_WorkingWithAbstraction.E04_TrafficLights;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String trafficLightsLine = scanner.nextLine();
        String[] trafficLightsAsString = trafficLightsLine.split("\\s+");

        TrafficLight[] trafficLights = new TrafficLight[trafficLightsAsString.length];
        for (int i = 0; i < trafficLightsAsString.length; i++) {
            String s = trafficLightsAsString[i];
            TrafficLight.Signal signal = TrafficLight.Signal.valueOf(s);
            trafficLights[i] = new TrafficLight(signal);
        }
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            updateTrafficLights(trafficLights);
            printTrafficLights(trafficLights);
        }
    }

    private static void updateTrafficLights(TrafficLight[] trafficLights) {

        for (TrafficLight light : trafficLights) {
            light.update();
        }
    }

    private static void printTrafficLights(TrafficLight[] trafficLights) {
        for (TrafficLight light : trafficLights) {
            System.out.print(light.getSignal() + " ");
        }
        System.out.println();
    }

}

