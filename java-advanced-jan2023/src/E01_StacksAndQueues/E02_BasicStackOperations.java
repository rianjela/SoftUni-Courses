package E01_StacksAndQueues;


import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class E02_BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pushNum = scanner.nextInt();
        int popNum = scanner.nextInt();
        int isPresentNum = scanner.nextInt();

        if (pushNum <= popNum) {
            System.out.println("0");

        } else {

            ArrayDeque<Integer> numsQueue = new ArrayDeque<>();

            for (int i = 0; i < pushNum; i++) {
                numsQueue.push(scanner.nextInt());
            }

            for (int i = 0; i < popNum; i++) {
                numsQueue.pop();
            }


            int queueSize = numsQueue.size();
            int minNum = Integer.MAX_VALUE;

            for (int i = 0; i < queueSize; i++) {
                int currentNum = numsQueue.peek();
                numsQueue.pop();

                if (isPresentNum == currentNum) {
                    System.out.println("true");
                    return;
                } else {
                    if (minNum > currentNum) {
                        minNum = currentNum;
                    }
                }
            }

            System.out.println(minNum);
        }

    }
}


