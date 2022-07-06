package com.company;

public class TypyDanych {

    public static void main(String[] args) {

        /* LICZBOWE - CALKOWITE */

        byte zmByte = Byte.MAX_VALUE;
        short zmShort = Short.MAX_VALUE;
        int zmInt = Integer.MAX_VALUE;
        long zmLong = Long.MAX_VALUE;
        zmLong = 2536789L;                  // L należy dodać na końcu jeżeli chcemy to zrzutować na Longa, nominalnie bedzie int

        /* LICZBOWE - ZMIENNOPRZECINKOWE */

        float zmFloat = 25.525F;            // jeżeli nie dodam F to zrzutuje automatycznie na typ double
        double zmDouble = 58.782D;          // można dodać D, ale nie trzeba;

        /* LOGICZNE */

        boolean zmBool = true;
        boolean zmBool2 = false;

        /* ZNAKOWE */

        char zmChar = '@';                  // ważne - może to być tylko jeden znak, zawsze w pojedynczym apostrofie,
        // może to być również litera lub cyfra

        /* STRING - Typ złożony */          // nie jest to typ prymitywny bo istnieje na bazie klasy, zapisujemy
                                            // z wielkiej litery to też świadczy o tym, że nie jest prymitywny a złożony

        String zmString = "Tekst";
        zmChar = zmString.charAt(0);
        System.out.println(zmChar);
    }
}
