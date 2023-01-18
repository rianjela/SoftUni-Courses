package E01_StacksAndQueues;
import java.util.Scanner;

public class E06_RecursiveFibonacci {
    public static long[] memoryFibNumbers;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        memoryFibNumbers = new long[n + 1];

        System.out.println(getFibonacci(n));
    }

    private static long getFibonacci(int n) {
        if (n <= 1) {
            return 1;
        }

        if (memoryFibNumbers[n] != 0) {
            return memoryFibNumbers[n];
        }

        return memoryFibNumbers[n] = getFibonacci(n - 1) + getFibonacci(n - 2);

    }
}
