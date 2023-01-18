package E01_StacksAndQueues;

import java.util.*;

public class E04_BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> numsQueue = new ArrayDeque<>();

        int[] commandArr = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int addNum = commandArr[0];
        int pollNum = commandArr[1];
        int isNumPresent = commandArr[2];

        int[] numbsToManipulateArr = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 0; i < addNum; i++) {
            numsQueue.offer(numbsToManipulateArr[i]);
        }

        if (!numsQueue.isEmpty()) {
            for (int i = 0; i < pollNum; i++) {
                numsQueue.poll();
            }
        }
        if (numsQueue.isEmpty()) {
            System.out.println("0");
        } else {
            int minNum = Integer.MAX_VALUE;

            while (!numsQueue.isEmpty()) {
                if (numsQueue.peek() == isNumPresent) {
                    System.out.println("true");
                    return;
                } else {
                    if (minNum > numsQueue.peek()) {
                        minNum = numsQueue.peek();

                    }
                    numsQueue.poll();
                }
            }

            System.out.println(minNum);
        }
    }
}
