package L05_List;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class l04_ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());



        String input = scanner.nextLine();

        while (!input.equals("end")) {
            if (input.contains("Add")) {
                String [] commandAdd = input.split(" ");
                numbersList.add(Integer.parseInt(commandAdd[1]));

            } else if (input.contains("Remove ")) {
                String [] commandRemove = input.split(" ");
                numbersList.remove(Integer.valueOf(commandRemove[1]));

            } else if (input.contains("RemoveAt")) {
                String [] commandRemoveAt = input.split(" ");
                numbersList.remove(Integer.parseInt(commandRemoveAt[1]));

            } else if (input.contains("Insert")) {
                String [] commandInsert = input.split(" ");
                numbersList.add(Integer.parseInt(commandInsert[2]), Integer.parseInt(commandInsert[1]));
            }


            input = scanner.nextLine();
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
