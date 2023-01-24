package L05_FunctionalProgramming;

import java.util.function.Function;

public class Demo {
    public static void main(String[] args) {
        Function<Integer, Integer> test = x -> x * x;

        increment(5);

    }

    private static int increment(int num) {
        return num + 1;
    }
}
