package com.codespace.work45;

public class Task45 {
    public static void main(String[] args) {
        // первая строка
        System.out.print("* | ");
        int digit = 1;
        while (digit <= 9) {
            System.out.print(digit + " ");
            digit++;
        }

        System.out.print("\n" + "---------------------");

        // строки с умножением
        int row = 1;
        while (row <= 9) {
            System.out.print("\n");
            System.out.print(row + " | ");
            digit = 1;
            while (digit <= 9) {
                System.out.print(row * digit + " ");
                digit++;
            }
            row++;
        }
    }
}
