package com.company;

import java.util.ArrayList;

public class TestOsoba {
    public static void main(String[] args) {
        Osoba tato = new Osoba("jan", "Kowalski", 35, 150, 1.95);
        // tato.imie = "Jan";
        //tato.nazwisko = "Kowalski";
        //tato.wiek = 35;
        //tato.wzrost = 1.95;
        //tato.waga = 150;

        Osoba mama = new Osoba("Barbara", "Kowalska", 35, 60, 1.70);
        // mama.imie = "Barbara";
        //mama.nazwisko = "kowalska";
        //mama.wiek = 35;
        //mama.wzrost = 1.70;
        //mama.waga = 60;

        Osoba corka = new Osoba("Alicja", "Kowalska", 10, 35, 1.50);
        //corka.imie = "Alicja";
        //corka.nazwisko = "Kowalska";
        //corka.wiek = 10;
        //corka.wzrost = 1.50;
        //corka.waga = 35;

        Osoba rafał = new Osoba("rafał", null, 0, 30, 0);
        // rafał.waga = 30;
        Osoba krzyś = new Osoba("krzyś", null, 0, 40, 0);
        // krzyś.waga = 40;
        Osoba kasia = new Osoba("kasia", null, 0, 30, 0);
        //kasia.waga = 30;

        ArrayList<Osoba> dzieci = new ArrayList();
        dzieci.add(rafał);
        dzieci.add(krzyś);
        dzieci.add(kasia);
        dzieci.add(corka);

        int size = dzieci.size();
        Rodzina kowalscy = new Rodzina(mama, tato, dzieci);
        //kowalscy.tata = tato;
        //kowalscy.mama = mama;
        //kowalscy.dzieci = dzieci;

        System.out.println("Czy Tato jest pełnoletni?: " + tato.pelnoletnia() + " | Czy tato jest wysoki? " + tato.wysoka());
        System.out.println("Czy córka jest pełnoletnia: " + corka.pelnoletnia() + " | Czy córka jest wysoka? " + corka.wysoka());

        int łącznaWagaRodziny = kowalscy.lacznaWaga();
        System.out.println("Wszyscy członkowie rodziny razem ważą: " + łącznaWagaRodziny);


    }
}
