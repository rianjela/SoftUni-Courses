package E01_StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class E05_BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] inputArr = scanner.nextLine().toCharArray();
        boolean isSymetric = false;

        if (inputArr.length % 2 != 0) {
            System.out.println("NO");
        } else {

            Deque<Character> openBracketsStack = new ArrayDeque<>();

            for (int i = 0; i < inputArr.length / 2; i++) {
                if (inputArr[i] == '{' || inputArr[i] == '(' || inputArr[i] == '[') {
                    openBracketsStack.push(inputArr[i]);
                } else {
                    System.out.println("NO");
                    return;
                }
            }

            if (openBracketsStack.isEmpty()){
                System.out.println("NO");
                return;
            }

            char currentOpenedBracket;
            for (int i = inputArr.length / 2; i < inputArr.length; i++) {

                char currentClosedBracket = inputArr[i];
                if (currentClosedBracket == '}' || currentClosedBracket == ')' || currentClosedBracket == ']') {

                    if (!openBracketsStack.isEmpty()) {
                        currentOpenedBracket = openBracketsStack.pop();
                        if (currentOpenedBracket == '(' && currentClosedBracket == ')') {
                            isSymetric = true;
                        } else if (currentOpenedBracket == '{' && currentClosedBracket == '}') {
                            isSymetric = true;
                        } else if (currentOpenedBracket == '[' && currentClosedBracket == ']') {
                            isSymetric = true;
                        } else {
                            isSymetric = false;
                            break;
                        }
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
}
