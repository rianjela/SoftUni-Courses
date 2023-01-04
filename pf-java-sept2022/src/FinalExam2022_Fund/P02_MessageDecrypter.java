package FinalExam2022_Fund;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02_MessageDecrypter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        String message = scanner.nextLine();

        String regexWhole = "([$]|[%])(?<tag>[A-Z][a-z]{2,})\\1: (\\[(?<num>[0-9]+)\\]\\|)+";
        Pattern pattern = Pattern.compile(regexWhole);
        String messageDecrypted = "";
        int counter = 0;
        for (int i = 0; i < number; i++) {

            Matcher matcher = pattern.matcher(message);
            boolean matcherFound = false;
            String tag = "";
            while (matcher.find()) {
                counter = 0;
                matcherFound = true;
                tag = matcher.group("tag");

                String regexDigits = "[0-9]+";
                Pattern patternDigits = Pattern.compile(regexDigits);
                Matcher matcherDigits = patternDigits.matcher(matcher.group());
                while (matcherDigits.find()) {
                    counter++;
                    char characterCurrent = (char) (Integer.parseInt(matcherDigits.group()));
                    messageDecrypted = messageDecrypted + characterCurrent;
                }

            }

            if (!matcherFound || counter > 3) {
                System.out.println("Valid message not found!");
            } else {
                System.out.printf("%s: %s\n", tag, messageDecrypted);
                messageDecrypted = "";
            }

            message = scanner.nextLine();

        }
    }
}
