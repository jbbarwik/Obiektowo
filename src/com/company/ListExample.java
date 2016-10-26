package com.company;

import java.util.ArrayList;

public class ListExample {
    public static void main(String[] args) {

        ArrayList<Osoba> dzieci = new ArrayList<>();

        dzieci.add(Rafał);
        dzieci.add(Kasia);
        dzieci.add(Krzyś);
        int size = dzieci.size();

        System.out.println(size);

        Osoba średnieDziecko = Osoba.get(1);

    }
}