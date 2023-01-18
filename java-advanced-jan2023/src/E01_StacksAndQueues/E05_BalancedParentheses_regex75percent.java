package E01_StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E05_BalancedParentheses_regex75percent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] inputArr = scanner.nextLine().toCharArray();

        if (inputArr.length % 2 != 0) {
            System.out.println("NO");
        } else {
            Deque<Character> stackChars = new ArrayDeque<>();
            Deque<Character> queueChars = new ArrayDeque<>();

            for (int i = 0; i < inputArr.length / 2; i++) {
                stackChars.push(inputArr[i]);
            }
            for (int i = inputArr.length / 2; i < inputArr.length; i++) {
                queueChars.offer(inputArr[i]);
            }

            String regex1 = "\\{}";
            String regex2 = "\\[]";
            String regex3 = "\\(\\)";
            Pattern pattern1 = Pattern.compile(regex1);
            Pattern pattern2 = Pattern.compile(regex2);
            Pattern pattern3 = Pattern.compile(regex3);
            boolean isSymetric = false;


            for (int i = 0; i < inputArr.length / 2; i++) {
                char stackCurrent = stackChars.pop();
                char queueCurrent = queueChars.poll();
                String matcherString = Character.toString(stackCurrent) + Character.toString(queueCurrent);

                Matcher matcher1 = pattern1.matcher(matcherString);
                Matcher matcher2 = pattern2.matcher(matcherString);
                Matcher matcher3 = pattern3.matcher(matcherString);

                if (matcher1.find() || matcher2.find() || matcher3.find()) {
                    isSymetric = true;
                } else {
                    isSymetric = false;
                    break;
                }

            }

            if (isSymetric) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
    }
}
