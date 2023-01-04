package e01_FirstStepsInCoding;

import java.util.Scanner;

public class VacationBooksList_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pagesBook = Integer.parseInt(scanner.nextLine());
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        int hoursWholeBook = pagesBook / pagesPerHour;
        int hoursPerDay = hoursWholeBook / days;

        System.out.println(hoursPerDay);

    }
}
