package e05_WhileLoop;

import java.util.Scanner;

public class E01_OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String bookWanted = scanner.nextLine();
        String bookSearch = scanner.nextLine();
        int bookCounter = 0;
        boolean foundIt = false;

        while (!bookSearch.equals("No More Books")) {

            if (bookSearch.equals(bookWanted)){
                foundIt = true;
                break;
            }

            bookCounter++;
            bookSearch = scanner.nextLine();
        }

        if (foundIt){
            System.out.printf("You checked %d books and found it.", bookCounter);
        } else {
            System.out.printf("The book you search is not here!\n" +
                    "You checked %d books.", bookCounter);
        }


    }
}
