package com.company;
public class TestOsoba {
    public static void main(String[] args){
        Osoba tato = new Osoba();
        tato.imie = "Jan";
        tato.nazwisko = "Kowalski";
        tato.wiek = 35;

        Osoba corka = new Osoba();
        corka.imie = "Alicja";
        corka.nazwisko = "Kowalska";
        corka.wiek = 10;
        System.out.println("Czy Tato jest pełnoletni?: "+tato.pelnoletnia());
        System.out.println("Czy córka jest pełnoletnia: "+corka.pelnoletnia());
    }
}
