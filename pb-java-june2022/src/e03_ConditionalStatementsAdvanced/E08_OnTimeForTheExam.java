package e03_ConditionalStatementsAdvanced;

import java.util.Scanner;

public class E08_OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hourExam = Integer.parseInt(scanner.nextLine());
        int minExam = Integer.parseInt(scanner.nextLine());
        int hourArrival = Integer.parseInt(scanner.nextLine());
        int minArrival = Integer.parseInt(scanner.nextLine());

        int minExamAll = hourExam*60 +minExam;
        int minArrivalAll = hourArrival*60+minArrival;
        int minDifference  = minExamAll-minArrivalAll;
        int hoursEarly = minDifference/60;
        int minEarly = minDifference%60;

        if (0<=minDifference && minDifference<=30){
            System.out.println("On time");
        } else if (minDifference<0){
            System.out.println("Late");
        } else {
            System.out.println("Early");
        }

        if (minDifference!=0){
            if (0<minDifference&&minDifference<60) {
                System.out.printf("%d minutes before the start", minDifference);
            }else if(minDifference>=60){
                System.out.printf("%d:%02d hours before the start", hoursEarly, minEarly);
            }else if (minDifference>-60){
                System.out.printf("%d minutes after the start", Math.abs(minDifference));
            } else {
                System.out.printf("%d:%02d hours after the start", Math.abs(hoursEarly), Math.abs(minEarly));
            }
        }
    }
}
