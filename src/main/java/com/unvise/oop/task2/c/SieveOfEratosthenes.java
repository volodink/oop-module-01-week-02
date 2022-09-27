package com.unvise.oop.task2.c;

import java.util.Arrays;

public class SieveOfEratosthenes {
    public static String compute(int number) {
        StringBuilder sb = new StringBuilder();
        boolean[] table = new boolean[number + 1];
        Arrays.fill(table, true);
        for (int i = 2; i <= number; i++) {
            if (table[i]) {
                for (int j = i * 2; j <= number; j += i) {
                    table[j] = false;
                }
                sb
                        .append(i)
                        .append(" ");
            }
        }
        return sb.toString();
    }
}
