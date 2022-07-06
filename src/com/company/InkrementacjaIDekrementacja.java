package com.company;

public class InkrementacjaIDekrementacja {

    public static void main(String[] args) {
        int a = 5;
//        a += 1;                   ale można też tak:
        a++;

        System.out.println(a++);        // inkrementacja nie zajdzie od razu, najpierw wyrzuci a, potem doda
        System.out.println(a);          // teraz doda ++ czyli wynikiem bedzie 7

        System.out.println(++a);        // teraz doda od razu 7 + 1 = 8
        System.out.println(--a);        // dekrementacja

    }
}
