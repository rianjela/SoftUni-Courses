package lab3_ConditionalStatementsAdvanced;

import java.util.Scanner;

public class A01_DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dayNumbers = Integer.parseInt(scanner.nextLine());
        String day = "Error";

        switch (dayNumbers){
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            case 7:
                day = "Sunday";
                break;
            }

            System.out.println(day);
}
}
