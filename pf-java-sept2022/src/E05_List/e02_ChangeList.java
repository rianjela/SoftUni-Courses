package E05_List;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class e02_ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] commandArr = command.split(" ");

            if (commandArr[0].equals("Delete")) {
                int elementToDelete = Integer.parseInt(commandArr[1]);
                for (int i = 0; i < numbersList.size(); i++) {
                    if (numbersList.get(i) == elementToDelete) {
                        numbersList.remove(i);
                        i = -1;
                    }
                }
            } else if (commandArr[0].equals("Insert")) {
                int element = Integer.parseInt(commandArr[1]);
                int position = Integer.parseInt(commandArr[2]);

                numbersList.add(position, element);
            }

            command = scanner.nextLine();
        }

        System.out.println(numbersList.toString().replaceAll("[\\[\\],]", ""));
    }
}
