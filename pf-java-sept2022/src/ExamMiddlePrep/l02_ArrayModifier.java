package ExamMiddlePrep;

import java.util.Arrays;
import java.util.Scanner;

public class l02_ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] numberArr = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        String[] command = scanner.nextLine().split("\\s+");

        while (!command[0].equals("end")) {

            switch (command[0]) {
                case "swap":
                    int swapIndex1 = Integer.parseInt(command[1]);
                    int swapIndex2 = Integer.parseInt(command[2]);

                    int num1 = numberArr[swapIndex1];
                    int num2 = numberArr[swapIndex2];

                    numberArr[swapIndex1] = num2;
                    numberArr[swapIndex2] = num1;
                    break;

                case "multiply":
                    int multiplyIndex1 = Integer.parseInt(command[1]);
                    int multiplyIndex2 = Integer.parseInt(command[2]);

                    numberArr[multiplyIndex1] = numberArr[multiplyIndex1] * numberArr[multiplyIndex2];
                    break;

                case "decrease":

                    for (int i = 0; i < numberArr.length; i++) {

                        numberArr[i] -= 1;
                    }

                    break;

            }


            command = scanner.nextLine().split("\\s+");
        }


        for (int i = 0; i <= numberArr.length - 1; i++) {
            if (i == numberArr.length - 1) {
                System.out.print(numberArr[i]);
            } else {
                System.out.print(numberArr[i] + ", ");
            }
        }
    }

}

