package ExamPrep;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class E03_HeroesOfCodeAndLogicVII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int heroesNumber = Integer.parseInt(scanner.nextLine());

        Map<String, Integer> hitPointsMap = new LinkedHashMap<>();
        Map<String, Integer> manaPointsMap = new LinkedHashMap<>();


        for (int i = 0; i < heroesNumber; i++) {
            String[] heroDataArr = scanner.nextLine().split(" ");
            String currentHeroName = heroDataArr[0];
            int currentHP = Integer.parseInt(heroDataArr[1]);
            int currentMP = Integer.parseInt(heroDataArr[2]);

            hitPointsMap.put(currentHeroName, currentHP);
            manaPointsMap.put(currentHeroName, currentMP);
        }

        String[] command = scanner.nextLine().split("\\s+-\\s+");

        while (!command[0].equals("End")) {
            String action = command[0];
            String heroName = command[1];

            switch (action) {
                case "CastSpell":
                    int manaNeeded = Integer.parseInt(command[2]);
                    String spellName = command[3];
                    int currentMana = manaPointsMap.get(heroName);

                    if (currentMana >= manaNeeded) {
                        manaPointsMap.put(heroName, currentMana - manaNeeded);
                        System.out.printf("%s has successfully cast %s and now has %d MP!\n", heroName, spellName, currentMana - manaNeeded);
                    } else {
                        System.out.printf("%s does not have enough MP to cast %s!\n", heroName, spellName);
                    }
                    break;

                case "TakeDamage":
                    int damageTaken = Integer.parseInt(command[2]);
                    String attacker = command[3];
                    int currentHP = hitPointsMap.get(heroName);

                    if (currentHP > damageTaken) {
                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!\n", heroName, damageTaken, attacker, currentHP - damageTaken);
                        hitPointsMap.put(heroName, currentHP - damageTaken);
                    } else {
                        System.out.printf("%s has been killed by %s!\n", heroName, attacker);
                        hitPointsMap.remove(heroName);
                        manaPointsMap.remove(heroName);
                    }
                    break;

                case "Recharge":
                    int manaRecharge = Integer.parseInt(command[2]);
                    int manaPoints = manaPointsMap.get(heroName);

                    if (manaPoints + manaRecharge > 200) {
                        manaRecharge = 200 - manaPoints;
                    }

                    System.out.printf("%s recharged for %d MP!\n", heroName, manaRecharge);
                    manaPointsMap.put(heroName, manaPoints + manaRecharge);
                    break;

                case "Heal":
                    int healPoints = Integer.parseInt(command[2]);
                    int currentHealth = hitPointsMap.get(heroName);

                    if (currentHealth + healPoints > 100) {
                        healPoints = 100 - currentHealth;
                    }

                    System.out.printf("%s healed for %d HP!\n", heroName, healPoints);
                    hitPointsMap.put(heroName, healPoints + currentHealth);
                    break;
            }

            command = scanner.nextLine().split("\\s+-\\s+");
        }

        for (Map.Entry<String, Integer> entry : manaPointsMap.entrySet()) {
            System.out.printf("%s\n  HP: %d\n  MP: %d\n", entry.getKey(), hitPointsMap.get(entry.getKey()), entry.getValue());
        }


    }
}
