package L04_Methods;

import java.util.Scanner;

public class L09_GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();

        switch (type) {
            case "int":
                int number1 = Integer.parseInt(scanner.nextLine());
                int number2 = Integer.parseInt(scanner.nextLine());
                System.out.println(getMax(number1, number2));
                break;
            case "char":
                char symbol1 = scanner.nextLine().charAt(0);
                char symbol2 = scanner.nextLine().charAt(0);
                System.out.println(getMax(symbol1, symbol2));
                break;
            case "string":
                String text1 = scanner.nextLine();
                String text2 = scanner.nextLine();
                System.out.println(getMax(text1, text2));
                break;

        }
    }


    public static int getMax(int n1, int n2) {
        if (n1 > n2) {
            return n1;
        } else {
            return n2;
        }
    }

    static char getMax(char s1, char s2) {
        if (s1 > s2) {
            return s1;
        } else {
            return s2;
        }
    }

    public static String getMax(String text1, String text2) {
        if (text1.compareTo(text2) >= 0) {
            return text1;
        } else {
            return text2;
        }
    }

}
