package L08_TextProcessing;


import java.util.Scanner;

public class L01_ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("end")) {
        StringBuilder reversedWord = new StringBuilder();

            for (int i = input.length() - 1; i >= 0; i--) {
                reversedWord.append(input.charAt(i));
            }

            System.out.printf("%s = %s\n", input, reversedWord);
            input = scanner.nextLine();
        }


    }
}
