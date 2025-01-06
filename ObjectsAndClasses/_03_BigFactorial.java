package ObjectsAndClasses;

import java.math.BigInteger;
import java.util.Scanner;

public class _03_BigFactorial {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        BigInteger startNum = BigInteger.valueOf(1);

        for (int i = 1; i <= n; i++) {
            startNum = startNum.multiply(BigInteger.valueOf(i));
        }
        System.out.println(startNum);
    }
}
