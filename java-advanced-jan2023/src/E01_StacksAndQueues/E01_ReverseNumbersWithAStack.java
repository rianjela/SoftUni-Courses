package E01_StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class E01_ReverseNumbersWithAStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Deque<Integer> numbersStack = new ArrayDeque<>();
        int[] numbersArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int element : numbersArr) {
            numbersStack.push(element);
        }

        for (int i = 0; i < numbersArr.length; i++) {
            System.out.print(numbersStack.pop() + " ");
        }


    }
}
