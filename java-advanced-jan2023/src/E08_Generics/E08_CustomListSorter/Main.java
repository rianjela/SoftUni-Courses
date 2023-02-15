package E08_Generics.E08_CustomListSorter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        CustomList<String> customList = new CustomList<>();

        while (!input.equals("END")) {
            String command = input.split("\\s+")[0];

            switch (command) {
                case "Add":
                    String element = input.split("\\s+")[1];
                    customList.addElement(element);
                    break;
                case "Remove":
                    int index = Integer.parseInt(input.split("\\s+")[1]);
                    customList.removeElement(index);
                    break;
                case "Contains":
                    String containedElement = input.split("\\s+")[1];
                    System.out.println(customList.contains(containedElement));
                    break;
                case "Swap":
                    int index1 = Integer.parseInt(input.split("\\s+")[1]);
                    int index2 = Integer.parseInt(input.split("\\s+")[2]);
                    customList.swap(index1, index2);
                    break;
                case "Greater":
                    String elementToCompare = input.split("\\s+")[1];
                    System.out.println(customList.countGreaterThan(elementToCompare));
                    break;
                case "Max":
                    customList.printMax();
                    break;
                case "Min":
                    customList.printMin();
                    break;
                case "Print":
                    customList.print();
                    break;
                case "Sort":
                    customList.sort();
                    break;

            }

            input = scanner.nextLine();
        }

    }
}
