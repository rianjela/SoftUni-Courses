package E03_Arrays;

import java.util.Scanner;

public class e07_MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] sequenceArray = scanner.nextLine().split(" ");
        String repeatedElement = "";
        int counter = 1;
        int maxLenght = 1;
        String repeatedMaxString = "";
        //2 1 1 2 3 3 2 2 2 1

        for (int i = 0; i < sequenceArray.length - 1; i++) {

            if (sequenceArray[i].equals(sequenceArray[i + 1])) {
                repeatedElement = sequenceArray[i];
                counter++;
            } else {
                counter = 1;
            }

            if (maxLenght < counter){
                maxLenght = counter;
                repeatedMaxString = repeatedElement;
            }

        }

        for (int i = 0; i < maxLenght; i++) {
            System.out.print(repeatedMaxString + " ");
        }

    }


}
