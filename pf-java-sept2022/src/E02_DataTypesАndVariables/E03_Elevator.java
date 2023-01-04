package E02_DataTypesАndVariables;

import java.util.Scanner;

public class E03_Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int people = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());

        double courses = Math.ceil(1.0 * people / capacity);

        System.out.printf("%.0f", courses);

    }
}
