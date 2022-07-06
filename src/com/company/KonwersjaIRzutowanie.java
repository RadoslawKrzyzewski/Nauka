package com.company;

public class KonwersjaIRzutowanie {

    public static void main(String[] args) {
        /* Rzutowanie niejawne */
        short zmShort = 125;
        int zmInt;
        zmInt = (int) zmShort;
        System.out.println(zmInt);

        /* Rzutowanie jawne */
        float zmFloat = 3.14F;
        long zmLong;
        zmLong = (long) zmFloat;
        System.out.println(zmLong);             // wynik będzie niedokładny bo w przypadku rzutowania niejawnego jak tu
        // godzimy się na utratę pewnych części wartości

        /* Liczbowe > String */
        String tekst = String.valueOf(zmInt);
        tekst = Long.toString(zmLong);
        System.out.println(tekst);

        /* String > Liczbowe */

        String tekst2 = "123.5";
        float zmFloat2 = Float.parseFloat(tekst2);
        System.out.println(zmFloat2 + 100);
        System.out.println(tekst2 + 100);               // tu nie wyjdzie 223,5 tylko 123,5100 - konkatenacja stringów
                                                        // czyli do łańcucha 123,5 dodano na końcu 100
    }
}
