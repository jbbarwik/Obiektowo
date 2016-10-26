package com.company;
public class Osoba {   ///shift f6 zmiana nazwa klasy
private String imie, nazwisko;
    private int wiek;
    private int waga;
    private double wzrost;


    public Osoba(String imie, String nazwisko, int wiek, int waga, double wzrost) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.waga = waga;
        this.wzrost = wzrost;
    if ( nazwisko != null){
this.nazwisko = nazwisko;
    }
    else {
        this.imie ="X";
    }
    }

    boolean pelnoletnia(){
        return wiek >= 18;
    }
    boolean wysoka() {
        return wzrost >= 1.90;
    }
    int getWaga(){
        return waga;
    }
   // public boolean czyJestWysoka[]{
       // if ()
    }

