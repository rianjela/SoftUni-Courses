package e02_ConditionalStatements;

import java.util.Scanner;

public class SumSeconds_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int time1 = Integer.parseInt(scanner.nextLine());
        int time2 = Integer.parseInt(scanner.nextLine());
        int time3 = Integer.parseInt(scanner.nextLine());

        int timeAll = time1 + time2 + time3;

        int min = timeAll / 60;
        int sec = timeAll % 60;

        System.out.printf("%d:%02d", min,sec);

    }
}
