package FinalExam;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _13_5_HeroesOfCodeAndLogic7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfHeroes = Integer.parseInt(scanner.nextLine());

        Map<String,Integer> heroHitPoints = new LinkedHashMap<>();
        Map<String,Integer> heroManaPoints = new LinkedHashMap<>();

        for (int i = 1; i <= numberOfHeroes ; i++) {
            String currentHero = scanner.nextLine();
            String heroName = currentHero.split("\\s")[0];
            int hitPoints = Integer.parseInt(currentHero.split("\\s")[1]);
            int manaPoints = Integer.parseInt(currentHero.split("\\s")[2]);
            heroHitPoints.put(heroName,hitPoints);
            heroManaPoints.put(heroName,manaPoints);
        }

        String input = scanner.nextLine();

        while (!input.equals("End")){
            String[] inputAsArray = input.split(" - ");
            String command = inputAsArray[0];
            String name = inputAsArray[1];
            switch (command){
                case "CastSpell":
                    int mpNeeded = Integer.parseInt(inputAsArray[2]);
                    String spellName = inputAsArray[3];
                    int currentMp = heroManaPoints.get(name);
                    if (currentMp >= mpNeeded){
                        currentMp -= mpNeeded;
                        heroManaPoints.put(name,currentMp);
                        System.out.printf("%s has successfully cast %s and now has %d MP!%n",name,spellName,currentMp);
                    } else {
                        System.out.printf("%s does not have enough MP to cast %s!%n",name,spellName);
                    }
                    break;
                case "TakeDamage":
                    int damage = Integer.parseInt(inputAsArray[2]);
                    String attacker = inputAsArray[3];
                    int currentHp = heroHitPoints.get(name);
                    currentHp -= damage;
                    if (currentHp > 0){
                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n",name,damage,attacker,currentHp);
                        heroHitPoints.put(name,currentHp);
                    } else {
                        heroHitPoints.remove(name);
                        heroManaPoints.remove(name);
                        System.out.printf("%s has been killed by %s!%n",name,attacker);
                    }
                    break;
                case "Recharge":
                    int amount = Integer.parseInt(inputAsArray[2]);
                    int currentAmountMp = heroManaPoints.get(name);
                    currentAmountMp += amount;
                    if (currentAmountMp > 200){
                        currentAmountMp = 200;
                        System.out.printf("%s recharged for %d MP!%n",name,currentAmountMp - heroManaPoints.get(name));
                        heroManaPoints.put(name,currentAmountMp);
                    }else {
                        System.out.printf("%s recharged for %d MP!%n",name,amount);
                        heroManaPoints.put(name,currentAmountMp);
                    }
                    break;
                case "Heal":
                    int amountHp = Integer.parseInt(inputAsArray[2]);
                    int currentAmountHp = heroHitPoints.get(name);
                    currentAmountHp += amountHp;
                    if (currentAmountHp > 100){
                        currentAmountHp = 100;
                        System.out.printf("%s healed for %d HP!%n",name,currentAmountHp - heroHitPoints.get(name));
                        heroHitPoints.put(name,currentAmountHp);
                    }else {
                        System.out.printf("%s healed for %d HP!%n",name,amountHp);
                        heroHitPoints.put(name,currentAmountHp);
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        for (Map.Entry<String,Integer> entry : heroHitPoints.entrySet()){
            String name = entry.getKey();
            int hitPoints = entry.getValue();
            int manaPoints = heroManaPoints.get(name);
            System.out.println(name);
            System.out.println("HP: " + hitPoints);
            System.out.println("MP: " + manaPoints);
        }
    }
}