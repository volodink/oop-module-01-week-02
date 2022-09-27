package com.unvise.oop.task2.a;

public class PyramidPrinter {
    public static String print(String symbol, int height) {
        if (height < 0) return "";
        StringBuilder sb = new StringBuilder();
        for (int i = height-1; i >= 0; i--) {
            String symbols = symbol.repeat(height - i);
            String spaceBeforeSymbols = " ".repeat(i);
            sb
                    .append(spaceBeforeSymbols)
                    .append(symbols)
                    .append("  ")
                    .append(symbols)
                    .append("\n");
        }
        return sb.toString();
    }
}
