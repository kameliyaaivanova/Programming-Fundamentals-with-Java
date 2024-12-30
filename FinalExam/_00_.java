package FinalExam;

import java.awt.desktop.ScreenSleepEvent;
import java.util.*;

public class _00_ {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        Map<String, Animal> animalName = new LinkedHashMap<>();
        Map<String, List<String>> animalArea = new LinkedHashMap<>();

        while (!command.equals("EndDay")) {
            String[] commandParts = command.split(": ");
            String[] animalInfo = commandParts[1].split("-");
            switch (commandParts[0]) {
                case "Add":

                    String area = animalInfo[2];
                    String name = animalInfo[0];
                    if (animalName.containsKey(name)) {
                        int foodToAdd = Integer.parseInt(animalInfo[1]);
                        animalName.get(name).setNeededFood(foodToAdd + animalName.get(name).getNeededFood());
                        if (animalArea.containsKey(area) && !((animalArea.get(area).contains(name)))) {
                            animalArea.get(area).add(name);
                        } else if (!animalArea.containsKey(area)) {
                            animalArea.putIfAbsent(area, animalArea.get(area));
                            animalArea.get(area).add(name);
                        }

                    } else {
                        animalName.putIfAbsent(name, new Animal(Integer.parseInt(animalInfo[1]), animalInfo[2]));
                        animalArea.putIfAbsent(area, new ArrayList<>());
                        animalArea.get(animalInfo[2]).add(name);
                    }

                    break;
                case "Feed":
                    name = animalInfo[0];
                    if (animalName.containsKey(name)) {
                        int eatenFood = Integer.parseInt(animalInfo[1]);
                        animalName.get(name).setNeededFood(animalName.get(name).getNeededFood() - eatenFood);
                        if (animalName.get(name).getNeededFood() <= 0) {
                            area = animalName.get(name).getArea();
                            animalName.remove(name);
                            if (animalName.containsKey(name)) {
                                if (animalArea.get(area).contains(name)) {
                                    animalArea.get(area).remove(name);
                                    if (animalArea.get(name).size() == 0) {
                                        animalArea.remove(area);
                                    }
                                }
                            } else {
                                animalArea.get(area).remove(name);
                                if (animalArea.get(area).isEmpty()) {
                                    animalArea.remove(area);
                                }
                            }
                            System.out.println(name + " was successfully fed");
                        }
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.println("Animals:");

        printingAMap(animalName);
        System.out.println("Areas with hungry animals:");
        printingAStringMap(animalArea);
    }

    static class Animal {
        int neededFood;
        String area;

        public Animal(int neededFood, String area) {
            this.neededFood = neededFood;
            this.area = area;

        }

        public int getNeededFood() {

            return neededFood;
        }

        public void setNeededFood(int neededFood) {

            this.neededFood = neededFood;
        }

        public String getArea() {
            return area;
        }

    }

    static void printingAMap(Map<String, Animal> animals) {
        for (Map.Entry<String, Animal> entry : animals.entrySet()) {
            System.out.println(" " + entry.getKey() + " -> " + entry.getValue().getNeededFood() + "g");


        }

    }

    static void printingAStringMap(Map<String, List<String>> area) {
        for (Map.Entry<String, List<String>> entry : area.entrySet()) {

            System.out.println(" " + entry.getKey() + ": " + entry.getValue().size());


        }


    }
}
