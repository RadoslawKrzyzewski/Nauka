package com.company;

public class OperatoryLogiczne {

    public static void main(String[] args) {
        boolean zmienna;
        zmienna = 2 == 2 || 5 > 10;                 // operator lub czyli aby było true to minimum jedno musi być true
        zmienna = 2 == 1 && 5 > 10;                 // operator i czyli obie muszą być true aby wynik był true
        zmienna = !(2 == 2);                        // negacja

        // Zagadka poniżej

        zmienna = true || false && false;           // da true bo tu kolejność jest inna niż w arytmetyce, bo tu
                                                    // zawsze najpierw wykonują się operatory negacji

        System.out.println(zmienna);
    }
}
