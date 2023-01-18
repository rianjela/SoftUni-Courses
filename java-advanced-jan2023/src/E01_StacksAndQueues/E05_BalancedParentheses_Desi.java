package E01_StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class E05_BalancedParentheses_Desi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        ArrayDeque<Character> openBracketsStack = new ArrayDeque<>();
        boolean isSymetric = false;

        for (char bracket : input.toCharArray()) {

            if (bracket == '(' || bracket == '{' || bracket == '[') {
                openBracketsStack.push(bracket);
            } else if (bracket == ')' || bracket == '}' || bracket == ']') {

                if (openBracketsStack.isEmpty()) {
                    isSymetric = false;
                    break;
                }

                char lastOpenedBracket = openBracketsStack.pop();

                if (lastOpenedBracket == '(' && bracket == ')') {
                    isSymetric = true;
                } else if (lastOpenedBracket == '{' && bracket == '}') {
                    isSymetric = true;
                } else if (lastOpenedBracket == '[' && bracket == ']') {
                    isSymetric = true;
                } else {
                    isSymetric = false;
                    break;
                }
            }
        }

        if (isSymetric) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
