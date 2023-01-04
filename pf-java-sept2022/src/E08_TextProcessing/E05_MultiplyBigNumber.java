package E08_TextProcessing;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class E05_MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstNumStr = scanner.nextLine().replaceFirst("^0+(?!$)", "");

        int[] firstNumArr = Arrays.stream(firstNumStr.split(""))
                .mapToInt(Integer::parseInt)
                .toArray();

        int secondNum = Integer.parseInt(scanner.nextLine());

        List<Integer> productNumber = new ArrayList<>();

        int remainder = 0;


        for (int i = firstNumArr.length - 1; i >= 0; i--) {
            int currentLastNum = firstNumArr[i];

            int newLastDigit = currentLastNum * secondNum + remainder;

            if (newLastDigit > 9) {
                remainder = newLastDigit / 10;
                if (i != 0) {
                    newLastDigit %= 10;
                }
            } else {
                remainder = 0;
            }
            productNumber.add(0, newLastDigit);
        }

        boolean isProductZero = true;

        for (int digit : productNumber) {
            if (digit != 0) {
                isProductZero = false;
                break;
            }
        }
        if (isProductZero) {
            System.out.println(0);
        } else {
            for (int digit : productNumber) {
                System.out.print(digit);
            }
        }

    }

}

