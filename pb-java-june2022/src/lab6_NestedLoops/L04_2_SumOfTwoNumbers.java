package lab6_NestedLoops;

import java.util.Scanner;

public class L04_2_SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int intervalStart = Integer.parseInt(scanner.nextLine());
        int intervalFin = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        int counterAll = 0;
        int a = intervalStart;
        int b = intervalStart;

        while (a>=intervalStart && a<=intervalFin){
           a++;
            while (b>=intervalStart && b<=intervalFin){
                b++;
                if (a+b == magicNumber){
                    counter++;
                    break;
                }
                }

            counterAll++;
            }


        if (counter != 0) {
            System.out.printf("Combination N:%d (%d + %d = %d)", counter, a, b, magicNumber);
        } else {
            System.out.printf("%d combinations - neither equals %d", counterAll, magicNumber);
        }
        } }





        /*for (int i = intervalFin; i >= intervalStart; i--) {
            for (int k = intervalStart; k <= intervalFin; k++) {

                if (i + k == magicNumber) {
                    a = i;
                    b = k;
                    counter++;
                    break;
                }
                counterAll++;
            }*/
