package L01_StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class L05_PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        ArrayDeque<String> printQueue = new ArrayDeque<>();
        String input = scanner.nextLine();

        while (!input.equals("print")) {
            boolean isOnStandby = false;

            if (!input.equals("cancel")) {
                printQueue.offer(input);
            } else {

                if (printQueue.size() == 0) {
                    isOnStandby = true;
                } else {
                    System.out.println("Canceled " + printQueue.peek());
                    printQueue.poll();
                }

            }

            if (isOnStandby) {
                System.out.println("Printer is on standby");
            }

            input = scanner.nextLine();
        }
        int queueSize = printQueue.size();
        for (int i = 0; i < queueSize; i++) {
            System.out.println(printQueue.peek());
            printQueue.poll();
        }

    }
}
