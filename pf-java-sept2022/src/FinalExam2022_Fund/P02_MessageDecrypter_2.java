package FinalExam2022_Fund;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02_MessageDecrypter_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        String message = scanner.nextLine();

        String regexWhole = "([$]|[%])(?<tag>[A-Z][a-z]{2,})\\1: (\\[(?<num>[0-9]+)\\]\\|){3}";
        Pattern pattern = Pattern.compile(regexWhole);
        String messageDecrypted = "";

        for (int i = 0; i < number; i++) {
            Matcher matcher = pattern.matcher(message);
            boolean matcherFound = false;
            String tag = "";

            while (matcher.find()) {
                matcherFound = true;
                tag = matcher.group("tag");
                int numCurrent = Integer.parseInt(matcher.group("num"));
                char symbol = (char) (numCurrent);
                messageDecrypted = messageDecrypted + symbol;
            }

            if (!matcherFound) {
                System.out.println("Valid message not found!");
            } else {
                System.out.printf("%s: %s\n", tag, messageDecrypted);
                messageDecrypted = "";
            }

            message = scanner.nextLine();

        }
    }
}
