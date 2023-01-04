package E07_AssociativeArrays;

import java.util.*;

public class E08_CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] currentCompanyID = scanner.nextLine().split("\\s+->\\s+");
        LinkedHashMap<String, List<String>> companiesMap = new LinkedHashMap<>();

        while (!currentCompanyID[0].equals("End")) {
            String companyName = currentCompanyID[0];
            String ID = currentCompanyID[1];

            if (!companiesMap.containsKey(companyName)) {
                List<String> firstID = new ArrayList<>();
                firstID.add(ID);
                companiesMap.put(companyName, firstID);
            } else {
                boolean containsID = false;
                for (int i = 0; i < companiesMap.get(companyName).size(); i++) {
                    if (companiesMap.get(companyName).get(i).equals(ID)) {
                        containsID = true;
                    }
                }
                if (!containsID) {
                    companiesMap.get(companyName).add(ID);
                }
            }

            currentCompanyID = scanner.nextLine().split("\\s+->\\s+");
        }

        for (Map.Entry<String, List<String>> entry : companiesMap.entrySet()) {

            System.out.println(entry.getKey());
            for (int i = 0; i < entry.getValue().size(); i++) {
                System.out.printf("-- %s\n", entry.getValue().get(i));
            }


        }

    }
}
