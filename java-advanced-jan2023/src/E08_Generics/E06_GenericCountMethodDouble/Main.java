package E08_Generics.E06_GenericCountMethodDouble;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Box<Double> box = new Box<>();

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            box.add(Double.parseDouble(input));
        }

        double element = Double.parseDouble(scanner.nextLine());
        System.out.println(box.countGreaterThan((element)));

    }
}
