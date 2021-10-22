package com.company;
import java.util.Scanner;

public class zadanie2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Wpisz swoją wagę:");
        float earthWeightAntosiak = input.nextFloat();
        float marsWeightAntosiak = (float)((double)earthWeightAntosiak * 0.38D);
        System.out.println("Twoja waga na Marsie jest równa: " + marsWeightAntosiak);
        double doublemarsWeightAntosiak = (double)marsWeightAntosiak;

        System.out.printf("Twoja waga na marsie w double: %.4f\n ", doublemarsWeightAntosiak);

        int intmarsWeightAntosiak = (int)doublemarsWeightAntosiak;
        System.out.println("Twoja waga na marsie w int: " + intmarsWeightAntosiak);
        char charMarsWeightAntosiak = (char)(intmarsWeightAntosiak + '0');
        System.out.println("Twoja waga na marsie w char: " + charMarsWeightAntosiak);
        charMarsWeightAntosiak -= 5;
        System.out.println("Twoja waga na marsie w char po math: " + charMarsWeightAntosiak);
        int resultCharMarsWeightAntosiak = (char) charMarsWeightAntosiak;
        System.out.println("Zmienna char no wykonanym działaniu matematycznym: " +
                " i przypisania do zmiennej int jest równa : " + resultCharMarsWeightAntosiak);

    }
}