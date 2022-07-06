package com.company;

public class InstrukcjeWarunkoweElseIf {

    public static void main(String[] args) {
        int number = 3;

        if (number > 0) {
            System.out.println("Liczba większa od 0");
        } else if (number < 0) {
            System.out.println("Liczba mniejsza od 0");
        } else {
            System.out.println("Liczba jest równa 0");
        }
    }
}
