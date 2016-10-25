package com.company;
public class Rodzina {
    Osoba mama;
    Osoba tata;
    Osoba dziecko;


    public int lacznaWaga() {
    return tata.waga+mama.waga+dziecko.waga;
    }
}