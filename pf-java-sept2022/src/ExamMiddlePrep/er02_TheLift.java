package ExamMiddlePrep;

import java.util.Arrays;
import java.util.Scanner;

public class er02_TheLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int customersCount = Integer.parseInt(scanner.nextLine());

        int[] liftCabinsArr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        boolean noMorePeople = false;


        for (int i = 0; i < liftCabinsArr.length; i++) {
            int leftSpaceOnCurrentCabin = 4 - liftCabinsArr[i];

            if (customersCount >= leftSpaceOnCurrentCabin) {
                liftCabinsArr[i] = liftCabinsArr[i] + leftSpaceOnCurrentCabin;
                customersCount -= leftSpaceOnCurrentCabin;
            } else {
                liftCabinsArr[i] = liftCabinsArr[i] + customersCount;
                customersCount = 0;
                noMorePeople = true;
                break;
            }

        }

        if (customersCount == 0) {
            noMorePeople = true;
        }

        if (noMorePeople && liftCabinsArr[liftCabinsArr.length - 1] < 4) {
            System.out.println("The lift has empty spots!");
            for (int element : liftCabinsArr) {
                System.out.print(element + " ");
            }
        } else if (!noMorePeople && liftCabinsArr[liftCabinsArr.length - 1] == 4) {
            System.out.printf("There isn't enough space! %d people in a queue!\n", customersCount);
            for (int element : liftCabinsArr) {
                System.out.print(element + " ");
            }

        } else if (noMorePeople && liftCabinsArr[liftCabinsArr.length - 1] == 4) {
            for (int element : liftCabinsArr) {
                System.out.print(element + " ");
            }
        }

    }
}
