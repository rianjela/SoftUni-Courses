package E07_AssociativeArrays;

import java.sql.Array;
import java.util.*;

public class E03_Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] productData = scanner.nextLine().split("\\s+");

        LinkedHashMap<String, Double> producPricetMap = new LinkedHashMap<>();
        LinkedHashMap<String, Double> productQuantityMap = new LinkedHashMap<>();

        while (!productData[0].equals("buy")) {
            String productCurrent = productData[0];
            double priceCurrent = Double.parseDouble(productData[1]);
            double quantityCurrent = Double.parseDouble(productData[2]);

            producPricetMap.putIfAbsent(productCurrent, 0.0);
            productQuantityMap.putIfAbsent(productCurrent, 0.0);

            producPricetMap.put(productCurrent, priceCurrent);
            productQuantityMap.put(productCurrent, productQuantityMap.get(productCurrent) + quantityCurrent);

            productData = scanner.nextLine().split("\\s+");
        }

        for (Map.Entry<String, Double> entry : producPricetMap.entrySet()) {

            double totalPrice = entry.getValue() * productQuantityMap.get(entry.getKey());
            System.out.printf("%s -> %.2f\n", entry.getKey(), totalPrice);
        }


    }
}
