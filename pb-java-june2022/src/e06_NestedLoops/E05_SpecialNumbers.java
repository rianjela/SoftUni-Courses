package e06_NestedLoops;

import java.util.Scanner;

public class E05_SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int counter = 0;


        for (int i = 1111; i < 9999; i++) {
            int temp = i;

            for (int j = 1; j <= 4; j++) {
                int lastDigit = temp % 10;

                if (lastDigit != 0) {
                    if (n % lastDigit != 0) {
                        break;
                    } else {
                        counter++;

                        if (counter == 4) {
                            System.out.printf("%d ", i);
                            break;
                        }
                    }
                    lastDigit = temp / 10;
                    temp /= 10;
                }
            }
            counter = 0;
        }
    }
}

