package com.unvise.oop.task3.c;

import com.unvise.oop.task3.util.InputAsArray;
import com.unvise.oop.task3.util.CommandLineArgumentCaptor;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        double[] numbers;
        if (args.length >= 2) {
            String[] arrayArgument = {args[0], args[1]};
            numbers = CommandLineArgumentCaptor.numberArray(arrayArgument);
        } else {
            try (Scanner scanner = new Scanner(System.in)) {
                numbers = InputAsArray.numbers(scanner);
            }
        }
        System.out.printf("Медиана: " + Median.compute(numbers) + "\n");
    }
}
