package L03_Arrays;

import java.util.Scanner;

public class L01_DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] weekDays = {
                "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
        };

        int input = Integer.parseInt(scanner.nextLine());

        if (input <= 0 || input > 7) {
            System.out.println("Invalid day!");
        } else {
            System.out.println(weekDays[input - 1]);
        }

    }
}
