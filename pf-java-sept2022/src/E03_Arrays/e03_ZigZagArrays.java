package E03_Arrays;

import java.util.Scanner;

public class e03_ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        String lineTwo = "";
        String lineOne = "";

        for (int i = 0; i < rows; i++) {
            String[] twoDigits = scanner.nextLine().split(" ");

            if (i % 2 != 0) {
                lineTwo += String.format("%s ", twoDigits[0]);
                lineOne += String.format("%s ", twoDigits[1]);
            } else {
                lineTwo += String.format("%s ", twoDigits[1]);
                lineOne += String.format("%s ", twoDigits[0]);
            }
        }

        System.out.println(lineOne);
        System.out.println(lineTwo);

    }
}
