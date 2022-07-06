package com.company;

public class Operatory {
    public static void main(String[] args) {
        // int a,b;     a = 5; b = 4;
        int dodawanie = 2 + 2;      // lub int dodawania = a + b;
        int odejmowanie = 3 - 2;
        int mnozenie = 2 * 3;
        int dzielenie = 6 / 2;
        int reszta = 8 % 3;         // reszta z dzielenia czyli 2

        System.out.format("Wynik dodawania: %d\n", dodawanie);
        System.out.format("Wynik odejmowania: %d\n", odejmowanie);
        System.out.format("Wynik mnożenia: %d\n", mnozenie);
        System.out.format("Wynik dzielenia: %d\n", dzielenie);
        System.out.format("Reszta z dzielenia: %d\n", reszta);

        System.out.println(2 + 2 * 2);  // jeżeli chcemy wymusić inną kolejność wykonywania działań to używamy nawiasów

        System.out.println(Math.pow(2, 3)); // pierwsze to podstawa potęgi, drugie to do której czyli dwa do trzeciej
        System.out.println(Math.sqrt(64));  // w javie można tylko wyciągać pierwiastki kwadratowe
    }
}
