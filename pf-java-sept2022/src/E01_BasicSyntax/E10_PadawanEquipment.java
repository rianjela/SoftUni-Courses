package E01_BasicSyntax;

import java.util.Scanner;

public class E10_PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double totalMoneyHad = Double.parseDouble(scanner.nextLine());
        int studentsCount = Integer.parseInt(scanner.nextLine());
        double lightsaberPrice = Double.parseDouble(scanner.nextLine());
        double robePrice = Double.parseDouble(scanner.nextLine());
        double beltPrice = Double.parseDouble(scanner.nextLine());

        double allLightabersPrice = studentsCount * lightsaberPrice + lightsaberPrice * Math.ceil(studentsCount * 10.0 / 100);
        double allRobesPrice = studentsCount * robePrice;
        int everySixth = studentsCount / 6;
        double allBeltsPrice = studentsCount * beltPrice - everySixth * beltPrice;

        double totalPrice = allLightabersPrice + allRobesPrice + allBeltsPrice;

        if (totalMoneyHad >= totalPrice) {
            System.out.printf("The money is enough - it would cost %.2flv.", totalPrice);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", Math.abs(totalPrice - totalMoneyHad));
        }
    }
}
