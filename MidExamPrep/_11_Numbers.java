package MidExamPrep;

import java.util.*;
import java.util.stream.Collectors;

public class _11_Numbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> newNumbers = new ArrayList<>();

        double sumOfAllNumbers = 0;

        for (int i = 0; i < numbers.size(); i++) {
            int currentNum = numbers.get(i);
            sumOfAllNumbers+= currentNum;
        }

        double averageValue =  (sumOfAllNumbers/numbers.size());
        for (int i = 0; i < numbers.size(); i++) {
            int currentNum = numbers.get(i);
            if (currentNum > averageValue) {
                newNumbers.add(currentNum);
            }
        }

        if (newNumbers.isEmpty()){
            System.out.println("No");
            return;
        }

        Collections.sort(newNumbers);
        Collections.reverse(newNumbers);

        while (newNumbers.size() > 5){
            newNumbers.remove(newNumbers.size()-1);
        }

        for (int number:newNumbers) {
            System.out.print(number + " ");
        }



    }
}
