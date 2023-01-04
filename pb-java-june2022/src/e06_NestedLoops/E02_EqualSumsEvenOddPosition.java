package e06_NestedLoops;

import java.util.Scanner;

public class E02_EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int tempNum = n1;
        int tempOdd = 0;
        int tempEven = 0;
        int tempNumModule = 0;
        boolean evenOddEquals = false;

        for (int i = n1; i <= n2; i++) {

            tempOdd = 0;
            tempEven = 0;
            tempNumModule = 0;
            tempNum = i;
            evenOddEquals = false;

            for (int j = 1; j <= 6; j++) {

                tempNumModule = tempNum % 10;

                if (j % 2 != 0) {
                    tempOdd += tempNumModule;
                } else {
                    tempEven += tempNumModule;
                }

                tempNum = tempNum / 10;
            }

            if (tempEven == tempOdd) {
                evenOddEquals = true;
            }


            if (evenOddEquals) {
                System.out.printf("%d ", i);
            }
        }

    }
}


