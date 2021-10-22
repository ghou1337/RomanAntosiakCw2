package com.company;

import java.util.Scanner;

public class zadanie3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Wpisz liczbę wygenerowanych liczb: ");
        int numberAntosiak = in.nextInt();
        in.close();
        int randomNumberAntosiak;
        for (int i = 0; i < numberAntosiak; i++) {
            randomNumberAntosiak = (int) (Math.random() * 100) + 1;
            if (randomNumberAntosiak % 2 == 0) {
                System.out.println("Wygenerowana liczba: " + randomNumberAntosiak + " jest parzystą");
            } else {
                System.out.println("Wygenerowana liczba: " + randomNumberAntosiak + " nie jest parzystą");
            }

        }

    }
}
