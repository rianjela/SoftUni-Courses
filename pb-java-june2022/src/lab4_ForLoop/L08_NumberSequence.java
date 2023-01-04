package lab4_ForLoop;

import java.util.Scanner;

public class L08_NumberSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;


        for (int i = 0; i < n; i++) {
            int value = Integer.parseInt(scanner.nextLine());

            if (value>maxValue){
                maxValue = value;
            }
            if (value<minValue){
                minValue = value;
            }
        }

        System.out.printf("Max number: %d%nMin number: %d",maxValue,minValue);

    }
}
