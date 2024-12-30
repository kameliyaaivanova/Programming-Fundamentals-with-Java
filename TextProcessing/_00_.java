package TextProcessing;

import java.util.Scanner;

public class _00_ {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

       String input = "ice";
       String text = "Kameliya is ice princess";

       int startOfInput = text.indexOf(input);
       int endIndex = startOfInput + input.length();


       String result = text.substring(0,startOfInput) + text.substring(endIndex,text.length());

       System.out.println(result);

        }
    }


