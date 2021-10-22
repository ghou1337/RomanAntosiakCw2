package com.company;
import java.math.BigDecimal;
import java.util.Scanner;

public class zadanie5 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        float nettoAntosiak = 9.99f;
        float VATAntosiak = nettoAntosiak * 23 / 100;
        float bruttoAntosiak = nettoAntosiak + VATAntosiak;
        System.out.println("Wpisz liczbę sprzedaży");
        int numberAntosiak = number.nextInt();
        number.close();

        BigDecimal bigDecimal_bruttoAntosiak = new BigDecimal(bruttoAntosiak * numberAntosiak);
        BigDecimal bigDecimal_nettoAntosiak = new BigDecimal(nettoAntosiak * numberAntosiak);
        System.out.println("Cena z VAT: " + bigDecimal_bruttoAntosiak);
        System.out.println("Cena bez VAT: " + bigDecimal_nettoAntosiak);
        System.out.println("Różnica: " + bigDecimal_bruttoAntosiak.subtract(bigDecimal_nettoAntosiak));

    }
}
