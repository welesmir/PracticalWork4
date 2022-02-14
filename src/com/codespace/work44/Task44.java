package com.codespace.work44;

public class Task44 {
    public static void main(String[] args) {
      int outcnt = 0;
      int digit = 1;

      while (digit <= 300) {
          if (((digit % 3) == 0) || ((digit % 4) == 0)) {
              outcnt++;
              System.out.print(digit + " ");
          }
          digit++;
          if (outcnt == 10) break;
      }
    }
}
