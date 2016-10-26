package com.company;

import java.util.ArrayList;

public class TestOsoba {
    public static void main(String[] args) {
        Osoba tato = new Osoba();
        tato.imie = "Jan";
        tato.nazwisko = "Kowalski";
        tato.wiek = 35;
        tato.wzrost = 1.95;
        tato.waga = 150;

        Osoba mama = new Osoba();
        mama.imie = "Barbara";
        mama.nazwisko = "kowalska";
        mama.wiek = 35;
        mama.wzrost = 1.70;
        mama.waga = 60;

        Osoba corka = new Osoba();
        corka.imie = "Alicja";
        corka.nazwisko = "Kowalska";
        corka.wiek = 10;
        corka.wzrost = 1.50;
        corka.waga = 35;

        Osoba rafał = new Osoba();
        rafał.waga = 30;
        Osoba krzyś = new Osoba();
        krzyś.waga = 40;
        Osoba kasia = new Osoba();
        kasia.waga = 30;

        ArrayList<Osoba> dzieci = new ArrayList();
        dzieci.add(rafał);
        dzieci.add(krzyś);
        dzieci.add(kasia);
        dzieci.add(corka);

        int size = dzieci.size();
        Rodzina rodzina = new Rodzina();
        rodzina.tata = tato;
        rodzina.mama = mama;
        rodzina.dzieci = dzieci;

        System.out.println("Czy Tato jest pełnoletni?: " + tato.pelnoletnia() + " | Czy tato jest wysoki? " + tato.wysoka());
        System.out.println("Czy córka jest pełnoletnia: " + corka.pelnoletnia() + " | Czy córka jest wysoka? " + corka.wysoka());



        int łącznaWagaRodziny = rodzina.lacznaWaga();
        System.out.println("Wszyscy członkowie rodziny razem ważą: " + łącznaWagaRodziny);



    }
}
