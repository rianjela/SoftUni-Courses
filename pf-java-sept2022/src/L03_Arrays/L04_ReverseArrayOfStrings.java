package L03_Arrays;

import java.util.Scanner;

public class L04_ReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        String currentString = "";

        for (int i = 0; i < input.length / 2; i++) {
            currentString = input[i];
            input[i] = input[input.length - 1 - i];
            input[input.length - 1 - i] = currentString;

        }

        System.out.println(String.join(" ", input));
        }
    }

