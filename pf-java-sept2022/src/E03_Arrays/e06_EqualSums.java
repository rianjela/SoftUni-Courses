package E03_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class e06_EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] numbersArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int currentDeviderNum = 0;
        int currentIndex = 0;
        int beforeSum = 0;
        int afterSum = 0;
        boolean isNo = false;

        for (int i = 0; i < numbersArr.length; i++) {

            currentDeviderNum = numbersArr[i];
            currentIndex = i;
            beforeSum = 0;
            afterSum = 0;
            isNo = false;

            for (int j = 0; j < i; j++) {


                    beforeSum += numbersArr[j];

            }

            for (int j = i + 1; j < numbersArr.length; j++) {


                    afterSum += numbersArr[j];

            }
            if (beforeSum == afterSum) {
                System.out.println(currentIndex);
                break;
            } else {
                isNo = true;
            }
        }

        if (isNo) {
            System.out.println("no");
        }

    }
}

