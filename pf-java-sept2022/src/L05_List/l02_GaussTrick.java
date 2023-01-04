package L05_List;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class l02_GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int listSize = numbersList.size();

        for (int i = 0; i < listSize / 2; i++) {
            int numbersI = numbersList.get(i) + numbersList.get(numbersList.size() - 1);
            numbersList.set(i, numbersI);
            numbersList.remove(numbersList.size() - 1);
        }

        System.out.println(joinIntNumbers(numbersList));

    }

    private static String joinIntNumbers(List<Integer> list) {
        String joinedNumbers = "";

        for (int i = 0; i < list.size(); i++) {
            joinedNumbers += list.get(i) + " ";
        }
        return joinedNumbers;
    }
}
