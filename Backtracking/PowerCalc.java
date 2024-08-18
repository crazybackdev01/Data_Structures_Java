package Backtracking;

import java.math.BigInteger;

public class PowerCalc {

    static int powerCalculation(int base, int power) {
        if (power == 0) {
            return 1;
        }

        if (base == 0) {
            return 0;
        }
        return base * powerCalculation(base, power - 1);
    }

    public static void main(String[] args) {
        BigInteger answer = BigInteger.valueOf((long) powerCalculation(2, 3));
        System.out.print(answer);
    }
}
