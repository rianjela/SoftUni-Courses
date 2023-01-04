package e02_ConditionalStatements;

import java.util.Scanner;

public class TimePlus15Minutes_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int finalMin = hours*60 + minutes + 15;

        int hoursPlus = finalMin / 60;
        int minPlus = finalMin % 60;

        if (hoursPlus==24){
            hoursPlus=0;
        }

        System.out.printf("%d:%02d", hoursPlus,minPlus);

    }
}
