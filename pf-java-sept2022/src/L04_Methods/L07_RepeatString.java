package L04_Methods;


import java.util.Scanner;

public class L07_RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int repeat = Integer.parseInt(scanner.nextLine());

        System.out.println(repeatText(input, repeat));
    }

    public static String repeatText(String text, int n) {
        String newText = "";
        for (int i = 0; i < n; i++) {
            newText += text;
        }

        return newText;
    }

}
