package E03_Arrays;

import java.util.Scanner;

public class e01_Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wagonsCount = Integer.parseInt(scanner.nextLine());
        int[] train = new int[wagonsCount];
        int sum = 0;

        for (int i = 0; i < wagonsCount; i++) {
            train[i] = Integer.parseInt(scanner.nextLine());
            sum += train[i];
        }

        for (int wagon : train) {
            System.out.print(wagon + " ");
        }
        System.out.println();
        System.out.print(sum);

    }
}

