package com.company;

public class ZmienneIStale {

    public static void main(String[] args) {

        String zmienna = "Java";
        //final String zmienna = "Java";                // jeżeli dodam słówko "final" to już nie będę mógł zmienić, piszemy też z
                                                        // wielkiej litery

        System.out.format("Hello %S", zmienna);
        System.out.println();
        System.out.format("Hello PI: %f!", Math.PI);    // %s to string, %f to float zgodnie z konwencją
    }
}
