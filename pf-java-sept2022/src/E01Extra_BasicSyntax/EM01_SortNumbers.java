package E01Extra_BasicSyntax;

import java.util.Scanner;

public class EM01_SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Read three real numbers and sort them in descending order. Print each number on a new line.

        double n1 = Double.parseDouble(scanner.nextLine());
        double n2 = Double.parseDouble(scanner.nextLine());
        double n3 = Double.parseDouble(scanner.nextLine());

        double maxValue = Double.MIN_VALUE;
        double minValue = Double.MAX_VALUE;
        double middleNum = 0;
        boolean n3Max = false;
        boolean n2Max = false;
        boolean n1Max = false;
        boolean n1Min = false;
        boolean n2Min = false;
        boolean n3Min = false;

        if (n1 > maxValue) {
            maxValue = n1;
            n1Max = true;
            n2Max = false;
            n3Max = false;
        }

        if (n2 > maxValue) {
            maxValue = n2;
            n1Max = false;
            n2Max = true;
            n3Max = false;
        }

        if (n3 > maxValue) {
            maxValue = n3;
            n1Max = false;
            n2Max = false;
            n3Max = true;
        }

        if (n1 < minValue) {
            minValue = n1;
            n1Min = true;
            n2Min = false;
            n3Min = false;
        }

        if (n2 < minValue) {
            minValue = n2;
            n1Min = false;
            n2Min = true;
            n3Min = false;
        }

        if (n3 < minValue) {
            minValue = n3;
            n1Min = false;
            n2Min = false;
            n3Min = true;
        }


        if (n1Min || n1Max) {
            if (n2Min || n2Max) {
                middleNum = n3;
            } else if (n3Min || n3Max) {
                middleNum = n2;
            }
        } else {
            middleNum = n1;
        }


        System.out.printf("%.0f\n", maxValue);
        System.out.printf("%.0f\n", middleNum);
        System.out.printf("%.0f", minValue);


    }
}
