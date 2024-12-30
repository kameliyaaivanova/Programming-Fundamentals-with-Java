package MidExamPrep;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _15_ShootForTheWin {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> targets = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();
        int count = 0;

        while (!command.equals("End")){
            int index = Integer.parseInt(command);

            if (index >= 0 && index < targets.size()){
                int numberFromTheIndex = targets.get(index);
                if (numberFromTheIndex != -1) {
                    targets.set(index, -1);
                    count++;

                } else {
                    continue;
                }

                for (int i = 0; i < targets.size() ; i++) {
                    int currentNum = targets.get(i);
                    if (currentNum == -1){
                        continue;
                    }
                    if (currentNum > numberFromTheIndex){
                        currentNum -= numberFromTheIndex;
                        targets.set(i,currentNum);
                    } else  {
                        currentNum += numberFromTheIndex;
                        targets.set(i,currentNum);
                    }
                }
            }


            command = scanner.nextLine();
        }

        System.out.printf("Shot targets: %d -> ", count);
        for (Integer target : targets) {
            System.out.print(target + " ");
        }
    }
}
