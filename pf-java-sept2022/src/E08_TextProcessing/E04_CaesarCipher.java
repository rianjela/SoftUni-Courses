package E08_TextProcessing;

import java.util.Scanner;

public class E04_CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] input = scanner.nextLine().toCharArray();

        for (int i = 0; i <input.length; i++) {
            input[i] += 3;
        }

        for (char symbol:input){
            System.out.print(symbol);
        }
    }


}
