package L03_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class L06_EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] firstArray = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] secondArray = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sumArray = 0;
        boolean identical = true;

        for (int i = 0; i < firstArray.length; i++) {

            if (firstArray[i] == secondArray[i]) {
                sumArray += firstArray[i];
            } else {
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                identical = false;
                break;
            }
        }

        if (identical) {
            System.out.printf("Arrays are identical. Sum: %d", sumArray);
        }
    }
}
