package com.company;

import java.util.ArrayList;

public class Rodzina {
    Osoba mama;
    Osoba tata;
    Osoba dziecko;
    ArrayList<Osoba> dzieci;


    public int lacznaWaga() {
    return tata.waga+mama.waga+dziecko.waga;
    }
    public int lacznaWagaDzieci(){
        int waga = 0;
        for (int i = 0; i<=dzieci.size(); i++){
            Osoba dziecko = dzieci.get(i);
          int wagaDziecka = dziecko.waga;
            waga += wagaDziecka;

        }
        return waga;
    }

}
