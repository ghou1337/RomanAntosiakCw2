package com.company;

public class zadanie4 {
    public static void main(String[] args) {
        int amountOfBricksAntosiak;
        int containerCapacityAntosiak;

        do {
            amountOfBricksAntosiak = (int)(Math.random() * 51) + 50;
        }while(amountOfBricksAntosiak % 2 == 0);
        System.out.println("ilość cegły: "+ amountOfBricksAntosiak);

        do {
            containerCapacityAntosiak = (int)(Math.random() * 6) + 5;
        }while(containerCapacityAntosiak % 2 != 0);
        int allContainersAntosiak = (amountOfBricksAntosiak/containerCapacityAntosiak) + 1;
        int fullContainersAntosiaik = (amountOfBricksAntosiak/containerCapacityAntosiak);
        float remainderAntosiak = (amountOfBricksAntosiak%containerCapacityAntosiak);
        System.out.println("Pojemność kontenera wynosi: "+ containerCapacityAntosiak);
        System.out.println("Jest " + allContainersAntosiak + " pojemników");
        System.out.println(fullContainersAntosiaik + " na " + allContainersAntosiak + " pojemników jest pełny");
        System.out.println("W niewypełnionym pojemniku znajduje się " + remainderAntosiak + " klocków Lego");
    }
}