package e02_ConditionalStatements;

import java.util.Scanner;

public class WorldSwimmingRecord_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double timeRecord = Double.parseDouble(scanner.nextLine());
        double distanceMeters = Double.parseDouble(scanner.nextLine());
        double timeForOneMeter = Double.parseDouble(scanner.nextLine());

        double delayCount = distanceMeters/15;
        double delaySec = 12.5 * Math.floor(delayCount);
        double timeIvan = distanceMeters*timeForOneMeter + delaySec;
        double timeDifference = timeRecord-timeIvan;

        if (timeRecord> timeIvan){
            System.out.printf("Yes, he succeeded! The new world record is %.02f seconds.", timeIvan);
        }
            else {
                 System.out.printf("No, he failed! He was %.02f seconds slower.", Math.abs(timeDifference));
            }
    }
}
