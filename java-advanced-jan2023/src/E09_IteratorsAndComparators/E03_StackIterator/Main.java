package E09_IteratorsAndComparators.E03_StackIterator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        CustomStack stack = new CustomStack();

        String input;

        while (!"END".equals(input = reader.readLine())) {
            modify(stack, input.trim().replaceAll(",", "").split("\\s+"));
        }
        stack.forEachMod(System.out::println);
        stack.forEachMod(System.out::println);
    }

    private static void modify(CustomStack stack, String[] data) {
        switch (data[0]) {
            case "Push":
                for (int i = 1; i < data.length; i++) {
                    stack.Push(Integer.parseInt(data[i]));
                }
                break;
            case "Pop":
                stack.Pop();
                break;
        }
    }
}

