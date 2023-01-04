package E05_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class e07_AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> arraysList = Arrays.stream(scanner.nextLine().split("\\|"))
                .collect(Collectors.toList());

        List<String> editedList = new ArrayList<>();

        for (int i = arraysList.size()-1; i >= 0; i--) {

            List<String> currentList = Arrays.stream(arraysList.get(i).split("\\s+"))
                    .collect(Collectors.toList());

            for (int j = 0; j < currentList.size(); j++) {
                if (currentList.get(j).equals("")){
                    currentList.remove(j);
                }
            }

            for (String element:currentList) {
                editedList.add(element);
            }

        }

        System.out.println(String.join(" ", editedList));
    }

}
