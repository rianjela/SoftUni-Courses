package ExamPrep;

import java.math.BigInteger;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FE05_E02EmojiDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Pattern patternDigits = Pattern.compile("[0-9]");
        Matcher matcherDigits = patternDigits.matcher(input);

        BigInteger coolThreshold = BigInteger.valueOf(1);

        while (matcherDigits.find()) {
            coolThreshold = coolThreshold.multiply(BigInteger.valueOf(Integer.parseInt(matcherDigits.group())));
        }

        System.out.println("Cool threshold: " + coolThreshold);

        String regexEmoji = "([:]{2}|[*]{2})(?<emoji>[A-Z][a-z]{2,})\\1";
        Pattern patternEmoji = Pattern.compile(regexEmoji);
        Matcher matcherEmoji = patternEmoji.matcher(input);

 //       int counterEmojis = 0;

        Map<String, BigInteger> coolEmojis = new LinkedHashMap<>();

        while (matcherEmoji.find()) {
            String currentEmoji = matcherEmoji.group("emoji");
            int emojiCoolness = 0;
   //         counterEmojis++;

            for (char letter : currentEmoji.toCharArray()) {
                if (Character.isLetter(letter)) {
                    emojiCoolness += letter;
                }
            }
                if (emojiCoolness > coolThreshold.intValue()) {
                    coolEmojis.put(matcherEmoji.group(), BigInteger.valueOf(emojiCoolness));
                }
        }
            //System.out.printf("%d emojis found in the text. The cool ones are:\n", counterEmojis);
            System.out.printf("%d emojis found in the text. The cool ones are:\n", coolEmojis.size());
            for (Map.Entry<String, BigInteger> entry : coolEmojis.entrySet()) {
                System.out.println(entry.getKey());
            }
    }
}
