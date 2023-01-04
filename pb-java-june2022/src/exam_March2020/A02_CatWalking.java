package exam_March2020;

import java.util.Scanner;

public class A02_CatWalking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int minPerDay = Integer.parseInt(scanner.nextLine());
        int walksCount = Integer.parseInt(scanner.nextLine());
        int caloriesTaken = Integer.parseInt(scanner.nextLine());

        int caloriesBurned = minPerDay * walksCount * 5;

        if (caloriesBurned >= caloriesTaken*50/100){
            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %d.", caloriesBurned);
        } else{
            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %d.",caloriesBurned);
        }


    }
}
