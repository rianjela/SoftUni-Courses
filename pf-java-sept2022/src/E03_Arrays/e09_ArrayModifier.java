package E03_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class e09_ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArray = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();


        String input = scanner.nextLine();

        while (!input.equals("end")) {

            if (input.contains("swap")) {
                int index1 = Integer.parseInt(input.split(" ")[1]);
                int index2 = Integer.parseInt(input.split(" ")[2]);
                int tempNum = numbersArray[index1];
                numbersArray[index1] = numbersArray[index2];
                numbersArray[index2] = tempNum;

            } else if (input.contains("multiply")) {
                int index1 = Integer.parseInt(input.split(" ")[1]);
                int index2 = Integer.parseInt(input.split(" ")[2]);
                numbersArray[index1] = numbersArray[index1] * numbersArray[index2];

            } else if (input.contains("decrease")) {

                for (int i = 0; i < numbersArray.length; i++) {
                    numbersArray[i]--;
                }
            }
            input = scanner.nextLine();
        }


        for (int i = 0; i <= numbersArray.length - 1; i++) {

            if (i == numbersArray.length - 1) {

                System.out.print(numbersArray[i]);

            } else {

                System.out.print(numbersArray[i] + ", ");
            }
        }


    }
}
