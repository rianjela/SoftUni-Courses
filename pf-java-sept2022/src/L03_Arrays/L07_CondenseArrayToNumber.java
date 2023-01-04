package L03_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class L07_CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int sum = 0;

        if (numbers.length == 1) {
            System.out.println(numbers[0]);
        } else {
            while (numbers.length > 1) {
                int[] newArray = new int[numbers.length - 1];
                for (int i = 0; i < numbers.length - 1; i++) {

                    newArray[i] = numbers[i] + numbers[i + 1];

                }
                numbers = newArray;
                sum = newArray[0];
            }

            System.out.println(sum);
        }
    }
}
