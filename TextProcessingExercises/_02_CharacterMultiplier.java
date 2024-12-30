package TextProcessingExercises;

import java.util.Scanner;

public class _02_CharacterMultiplier {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 1. прочитам си входните данни.
        // 2. получавам масив от стрингове
        // 3. раделям масива по спейс и полувавам отделни думи
        // 4. правя метод, в който  ще пресметна стойността на всички букви от единия
        //    стринг умножени по буквите на другия стринг.
        // 5. създавам метод, който ще ми принтира резултата
        // 6. изчислявам си коя от двете думи е с по- голяма дължина и коя е с по-къса
        //    и запазвам техните стойности.
        // 7. създавам променлива сум , кудето ще сумирам техните суми.
        // 8. правя фор цикъл от 0 до думата с по-къса дължина, като взимам позициите от двете думи
        //    и ги умножавам, след което ги прибавям към общата сума.
        // 9. след това проверявам дали двете думи са с еднаква дължина,ако да, тогава принтирам сумата
        // 10. ако първата дума е с по-голямата дължина, то тогава правя един фор цикъл,
        //     който ще ми започне от края на по-късата дума и ще стигне до края на първата дума,
        //     взимайки всеки един елемент и добавяйки го към сумата/
        // 11. ако втората дума е с по-голяма дължина правя същото, но до края на втората дума.
        //.12 принтирам сумата.













        String[] words = scanner.nextLine().split(" ");
        String firstWord = words[0];
        String secondWord = words[1];


        sumOfWords(firstWord,secondWord);
    }
    public static void sumOfWords(String firstWord,String secondWord){

        int minLength = Math.min(firstWord.length(),secondWord.length());
        int maxLength = Math.max(firstWord.length(),secondWord.length());

        int sum = 0;

        for (int i = 0; i < minLength; i++) {
            sum += firstWord.charAt(i) * secondWord.charAt(i);
        }

        if (firstWord.length() == secondWord.length()){
            System.out.println(sum);

        } else if (firstWord.length() == maxLength){
            for (int i = minLength; i < firstWord.length(); i++) {
                sum+= firstWord.charAt(i);
            }
            System.out.println(sum);

        }else if (secondWord.length() == maxLength){
            for (int i = minLength; i < secondWord.length(); i++) {
                sum += secondWord.charAt(i);
            }
            System.out.println(sum);
        }




    }

}
