package E01_StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class E03_MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int commandCount = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> numbersStack = new ArrayDeque<>();

        for (int i = 0; i < commandCount; i++) {
            String command = scanner.nextLine();

            if (command.contains("1")) {
                int pushNumber = Integer.parseInt(command.split("\\s+")[1]);
                numbersStack.push(pushNumber);
            } else if (command.contains("2")) {
                if (numbersStack.size() > 0) {
                    numbersStack.pop();
                }
            } else if (command.contains("3")) {

                if (!numbersStack.isEmpty()) {
                    int maxNum = Integer.MIN_VALUE;
                    ArrayDeque<Integer> copyStack = numbersStack.clone();

                    while (!copyStack.isEmpty()) {

                        int currentNum = copyStack.pop();
                        if (maxNum < currentNum) {
                            maxNum = currentNum;
                        }
                    }
                    System.out.println(maxNum);
                }
            }

        }
    }
}
