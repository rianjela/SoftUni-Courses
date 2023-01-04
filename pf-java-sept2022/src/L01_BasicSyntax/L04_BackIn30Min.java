package L01_BasicSyntax;

import java.util.Scanner;

public class L04_BackIn30Min {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hoursBefore = Integer.parseInt(scanner.nextLine());
        int minBefore = Integer.parseInt(scanner.nextLine());

        int minTotalPlus30 = hoursBefore*60 + minBefore +30;

        int hoursAfter = minTotalPlus30 / 60;
        int minAfter = minTotalPlus30 % 60;

        if (hoursAfter>=24){
            hoursAfter =0;
        }

        System.out.printf("%d:%02d", hoursAfter, minAfter);

    }
}
