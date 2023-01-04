package lab6_NestedLoops;

import java.util.Scanner;

public class L04_SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int intervalStart = Integer.parseInt(scanner.nextLine());
        int intervalFin = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());
        int counterAll = 0;
        int a = 0;
        int b = 0;
        boolean magicSum = false;


        for (int i = intervalStart; i <= intervalFin; i++) {
            for (int k = intervalStart; k <= intervalFin; k++) {

                counterAll++;

                if (i + k == magicNumber) {
                    a = i;
                    b = k;
                    magicSum = true;
                    break;
                }

            }
                if (magicSum){
                    break;
                }

        }
        if (magicSum) {
            System.out.printf("Combination N:%d (%d + %d = %d)", counterAll, a, b, magicNumber);
        } else {
            System.out.printf("%d combinations - neither equals %d", counterAll, magicNumber);
        }

    }

}

