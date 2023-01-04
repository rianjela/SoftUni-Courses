package e04_ForLoop;

import java.util.Scanner;

public class E03_Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int p4 = 0;
        int p5 = 0;

        for (int i = 1; i <= n; i++) {
            int p = Integer.parseInt(scanner.nextLine());

            if (p < 200) {
                ++p1;
            } else if (p < 400) {
                ++p2;
            } else if (p < 600) {
                ++p3;
            } else if (p < 800) {
                ++p4;
            } else {
                ++p5;
            }
        }


        System.out.printf("%.02f%%%n", 1.0*p1/n*100);
        System.out.printf("%.02f%%%n", 1.0*p2/n*100);
        System.out.printf("%.02f%%%n", 1.0*p3/n*100);
        System.out.printf("%.02f%%%n", 1.0*p4/n*100);
        System.out.printf("%.02f%%%n", 1.0*p5/n*100);

    }
}
