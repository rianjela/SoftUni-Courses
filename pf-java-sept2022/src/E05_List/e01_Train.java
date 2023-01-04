package E05_List;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class e01_Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> wagonsList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int wagonCapacity = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        while (!input.equals("end")) {
            if (input.contains("Add")) {
                String[] commandAdd = input.split(" ");
                wagonsList.add(Integer.parseInt(commandAdd[1]));
            } else {

                for (int wagonNumber = 0; wagonNumber < wagonsList.size(); wagonNumber++) {
                    int currentWagon = wagonsList.get(wagonNumber);
                    if (currentWagon + Integer.parseInt(input) <= wagonCapacity) {
                        wagonsList.set(wagonNumber, currentWagon + Integer.parseInt(input));
                        break;
                    }
                }
            }

            input = scanner.nextLine();
        }

        System.out.println(wagonsList.toString().replaceAll("[\\[\\],]", ""));
    }
}
