package com.juaracoding;

import java.util.Scanner;
public class Praktikum2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        System.out.println("Masukkan angka-angka (akhir dengan karakter selain angka):");

        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            sum += number;
            count++;
        }

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Rata-rata: " + average);
        } else {
            System.out.println("Tidak ada angka yang dimasukkan.");
        }

        scanner.close();
    }
}
