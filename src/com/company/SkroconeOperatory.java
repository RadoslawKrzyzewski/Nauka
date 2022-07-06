package com.company;

public class SkroconeOperatory {
    public static void main(String[] args) {

        int a;
        a = 10;
        //       a = a + 5;                    można w ten sposób zwiększyć "a" o 5, ale można też skróconym operatorem:
        a += 5;
        a -= 2;
        a *= 2;
        a /= 2;
        a %= 5;

        System.out.println(a);
    }
}
