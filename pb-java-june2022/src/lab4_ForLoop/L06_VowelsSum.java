package lab4_ForLoop;

import java.util.Scanner;

public class L06_VowelsSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int length = text.length();
        int points = 0;

        for (int i = 0; i <= length - 1; i++) {
            char letter = text.charAt(i);
            switch (letter) {
                case 'a':
                    points += 1;
                    break;
                case 'e':
                    points += 2;
                    break;
                case 'i':
                    points += 3;
                    break;
                case'o':
                    points += 4;
                    break;
                case'u':
                    points +=5;
                    break;
            }
        }
        System.out.println(points);
    }
}
