package E09_RegularExpressions;

import com.sun.jdi.Value;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class E02_Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] racersArr = scanner.nextLine().split(",\\s+");
        String racerData = scanner.nextLine();

        String regexTakeLetters = "[A-Za-z]";
        Pattern patternLetters = Pattern.compile(regexTakeLetters);

        String regexTakeDigits = "\\d";
        Pattern patternDigits = Pattern.compile(regexTakeDigits);

        Map<String, Integer> racersMap = new LinkedHashMap<>();
        for (String racer : racersArr) {
            racersMap.put(racer, 0);
        }


        while (!racerData.equals("end of race")) {
            Matcher matcherName = patternLetters.matcher(racerData);
            Matcher matcherDistance = patternDigits.matcher(racerData);

            StringBuilder currentRacer = new StringBuilder();
            while (matcherName.find()) {
                currentRacer.append(matcherName.group());
            }

            if (racersMap.containsKey(currentRacer.toString())) {

            int currentDistance = 0;
            while (matcherDistance.find()) {
                currentDistance += Integer.parseInt(matcherDistance.group());
            }
                racersMap.put(currentRacer.toString(), racersMap.get(currentRacer.toString()) + currentDistance);
            }

            racerData = scanner.nextLine();
        }


        List<String> top3Names = racersMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(3)
                .map(entry -> entry.getKey())
                .collect(Collectors.toList());

        System.out.printf("1st place: %s\n2nd place: %s\n3rd place: %s", top3Names.get(0), top3Names.get(1), top3Names.get(2));

    }
}
