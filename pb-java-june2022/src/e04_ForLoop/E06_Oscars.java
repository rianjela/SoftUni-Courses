package e04_ForLoop;

import java.util.Scanner;

public class E06_Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String nameActor = scanner.nextLine();
        double points = Double.parseDouble(scanner.nextLine());
        int juryCount = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= juryCount; i++) {
            String nameJury = scanner.nextLine();
            double pointsJury = Double.parseDouble(scanner.nextLine());
            points += nameJury.length()*pointsJury/2;

            if (points>1250.5){
                System.out.printf("Congratulations, %s got a nominee for leading role with %.01f!", nameActor, points);
                return;
            }

        }
        System.out.printf("Sorry, %s you need %.01f more!", nameActor, 1250.5 - points);
    }


}
