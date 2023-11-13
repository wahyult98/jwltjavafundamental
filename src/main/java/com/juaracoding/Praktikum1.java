package com.juaracoding;

import java.util.Scanner;
public class Praktikum1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("(Input)\t\tMasukkan Kata : ");
        String input = scanner.nextLine();
        int totalAsciiSum = calculateNonAlphabeticAsciiSum(input);
        System.out.println("(Output)\tHasil\t: " + totalAsciiSum);

        scanner.close();
    }

    private static int calculateNonAlphabeticAsciiSum(String input) {
        int sumAscii = 0;
        for (char character : input.toCharArray()) {
            int charAscii = (int) character;

            if (!(charAscii >= 97 && charAscii <= 122)){
                sumAscii += charAscii;
            }
        }
        return sumAscii;
    }
}
