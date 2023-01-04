package lab3_ConditionalStatementsAdvanced;

import java.util.Scanner;

public class A11_FruitShop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        double count = Double.parseDouble(scanner.nextLine());
        double price = 0;
//banana / apple / orange / grapefruit / kiwi / pineapple / grapes
        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":

               if (fruit.equals("banana")){
                   price = count*2.5;
               }else if(fruit.equals("apple")) {
                   price = count*1.2;
               }else if(fruit.equals("orange")) {
                   price = count*0.85;
               }else if(fruit.equals("grapefruit")) {
                   price = count*1.45;
               }else if(fruit.equals("kiwi")) {
                   price = count*2.7;
               }else if(fruit.equals("pineapple")) {
                   price = count*5.5;
               }else if(fruit.equals("grapes")) {
                   price = count * 3.85;
               }

                break;

            case "Saturday":
            case "Sunday":

                if (fruit.equals("banana")){
                    price = count*2.7;
                }else if(fruit.equals("apple")) {
                    price = count*1.25;
                }else if(fruit.equals("orange")) {
                    price = count*0.9;
                }else if(fruit.equals("grapefruit")) {
                    price = count*1.6;
                }else if(fruit.equals("kiwi")) {
                    price = count*3;
                }else if(fruit.equals("pineapple")) {
                    price = count*5.6;
                }else if(fruit.equals("grapes")) {
                    price = count * 4.2;
                }

                break;

        }

        if (price!=0){
            System.out.printf("%.02f", price);
        } else {
            System.out.println("error");
        }
    }
}
