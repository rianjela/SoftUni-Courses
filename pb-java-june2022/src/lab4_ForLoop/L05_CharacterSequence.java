package lab4_ForLoop;

import java.util.Scanner;

public class L05_CharacterSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        int length = text.length();

        for (int i = 0; i <= length-1 ; i++)
            System.out.println(text.charAt(i));

    }
}
