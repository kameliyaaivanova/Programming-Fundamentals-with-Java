package FinalExam;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _19_7_WildZoo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        HashMap<String, HashMap<Integer, String>> animalsMap = new HashMap<>();

        String input = "";
        while(!input.equals("EndDay")){
            input = scanner.nextLine();

            if(input.contains("Add:")){
                String newInput = input.replace("Add: ", "");
                String[] splitInput = newInput.split("-");

                HashMap<Integer, String> tempMap = new HashMap<>();
                tempMap.put(Integer.parseInt(splitInput[1]), splitInput[2]);

                if (animalsMap.containsKey(splitInput[0])){
                    int oldAmount = 0;
                    for(Map.Entry<Integer, String> entry : animalsMap.get(splitInput[0]).entrySet()){
                        oldAmount = entry.getKey();
                    }
                    animalsMap.get(splitInput[0]).remove(oldAmount);
                    animalsMap.get(splitInput[0]).put(Integer.parseInt(splitInput[1]) + oldAmount, splitInput[2]);
                } else{
                    animalsMap.put(splitInput[0],tempMap);
                }
            }

            if (input.contains("Feed:")){
                String newInput = input.replace("Feed: ", "");
                String[] splitInput = newInput.split("-");

                if (animalsMap.containsKey(splitInput[0])){
                    int oldAmount = 0;
                    String oldArea = "";
                    for(Map.Entry<Integer, String> entry : animalsMap.get(splitInput[0]).entrySet()){
                        oldAmount = entry.getKey();
                        oldArea = entry.getValue();
                    }
                    animalsMap.get(splitInput[0]).remove(oldAmount);
                    animalsMap.get(splitInput[0]).put(oldAmount - Integer.parseInt(splitInput[1]), oldArea);

                    for(Map.Entry<Integer, String> entry : animalsMap.get(splitInput[0]).entrySet()){
                        if(entry.getKey() <= 0){
                            for(String s : animalsMap.keySet()){
                                if(s.equals(splitInput[0])){
                                    System.out.println(s + " was successfully fed");
                                }
                            }
                             animalsMap.remove(splitInput[0]);
                        }
                    }
                }
            }
        }

        System.out.println("Animals:");
        for(String s : animalsMap.keySet()){
            for(Map.Entry<Integer, String> entry : animalsMap.get(s).entrySet()){
                System.out.println(" " + s + " -> " + entry.getKey() + "g");
            }
        }

        HashMap<String, Integer> areas = new HashMap<>();
        for(String s : animalsMap.keySet()){
            for(Map.Entry<Integer, String> entry : animalsMap.get(s).entrySet()){
                if(areas.containsKey(entry.getValue())){
                    int curr = areas.get(entry.getValue());
                    curr++;
                    areas.replace(entry.getValue(), curr);
                } else{
                    areas.put(entry.getValue(), 1);
                }
            }
        }

        System.out.println("Areas with hungry animals:");
        for(String s : areas.keySet()){
            System.out.println(" " + s + ": " + areas.get(s));
        }
    }
}
