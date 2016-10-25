package com.company;
public class TestOsoba {
    public static void main(String[] args){
        Osoba tato = new Osoba();
        tato.imie = "Jan";
        tato.nazwisko = "Kowalski";
        tato.wiek = 35;
        tato.wzrost = 1.95;

        Osoba corka = new Osoba();
        corka.imie = "Alicja";
        corka.nazwisko = "Kowalska";
        corka.wiek = 10;
        corka.wzrost = 1.50;
        System.out.println("Czy Tato jest pełnoletni?: "+tato.pelnoletnia()+" czy tato jest wysoki? "+tato.wysoka());
        System.out.println("Czy córka jest pełnoletnia: "+corka.pelnoletnia()+" czy córka jest wysoka? "+corka.wysoka());
    }
}
