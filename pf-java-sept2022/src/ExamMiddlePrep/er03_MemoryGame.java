package ExamMiddlePrep;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class er03_MemoryGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> sequenceList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        String[] input = scanner.nextLine().split("\\s+");
        int moves = 0;

        while (!input[0].equals("end")) {
            int firstIndex = Integer.parseInt(input[0]);
            int secondIndex = Integer.parseInt(input[1]);
            moves++;

            if (!areIndexesAllowed(firstIndex, secondIndex, sequenceList)) {
                sequenceList.add(sequenceList.size() / 2, "-" + moves + "a");
                sequenceList.add(sequenceList.size() / 2, "-" + moves + "a");
                System.out.println("Invalid input! Adding additional elements to the board");
            } else if (sequenceList.get(firstIndex).equals(sequenceList.get(secondIndex))) {
                System.out.printf("Congrats! You have found matching elements - %s!\n", sequenceList.get(firstIndex));
                if (firstIndex > secondIndex) {
                    sequenceList.remove(firstIndex);
                    sequenceList.remove(secondIndex);
                } else {
                    sequenceList.remove(secondIndex);
                    sequenceList.remove(firstIndex);
                }
            } else {
                System.out.println("Try again!");
            }

            if (sequenceList.size() == 0) {
                System.out.printf("You have won in %d turns!", moves);
                break;
            }

            input = scanner.nextLine().split("\\s+");
        }

        if (sequenceList.size() > 0) {
            System.out.println("Sorry you lose :(");
            System.out.println(sequenceList.toString().replaceAll("[\\[\\],]", ""));
        }
    }

    public static boolean areIndexesAllowed(int index1, int index2, List<String> list) {
        boolean areIndexesAllowed;
        areIndexesAllowed = index1 >= 0 && index1 < list.size() && index1 != index2 && index2 >= 0 && index2 < list.size();
        return areIndexesAllowed;
    }

}
