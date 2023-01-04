package ExamPrep;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FER03_02MirrorWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        List<String> matchingCouples = new ArrayList<>();

        String regex = "([#]|[@])(?<firstWord>[A-Za-z]{3,})\\1\\1(?<secondWord>[A-Za-z]{3,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        Boolean isValidPair = false;
        int counter = 0;
        while (matcher.find()) {
            counter++;
            isValidPair = true;
            String firstWord = matcher.group("firstWord");
            String secondWord = matcher.group("secondWord");

            String reversedFirstWord = new StringBuilder(firstWord).reverse().toString();

            if (reversedFirstWord.equals(secondWord)) {
                matchingCouples.add(String.format("%s <=> %s", firstWord, secondWord));
            }
        }

        if (!isValidPair) {
            System.out.println("No word pairs found!");
        } else {
            System.out.printf("%d word pairs found!\n", counter);
        }

        if (matchingCouples.size() > 0) {
            System.out.println("The mirror words are:");
            System.out.println(String.join(", ", matchingCouples));

        } else {
            System.out.println("No mirror words!");
        }


    }
}
