package exam_July2022;

import java.util.Scanner;

public class E04_Workout {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int N = Integer.parseInt(scanner.nextLine());
        double M = Double.parseDouble(scanner.nextLine());
        double allRanKm = M;



        for (int i = 1; i <= N; i++) {

            int K = Integer.parseInt(scanner.nextLine());

            M += M * K / 100;
            allRanKm += M;

        }



        if (allRanKm >= 1000) {
            System.out.printf("You've done a great job running %.0f more kilometers!", Math.ceil (allRanKm - 1000));
        } else {
            System.out.printf("Sorry Mrs. Ivanova, you need to run %.0f more kilometers", Math.ceil (1000 - allRanKm));
        }


    }
}
