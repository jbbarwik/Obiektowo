package com.company;

import java.util.ArrayList;

public class Rodzina {
   private Osoba mama;
    private Osoba tata;
    private ArrayList<Osoba> dzieci;

    public Rodzina(Osoba mama, Osoba tata, ArrayList<Osoba> dzieci) {
        this.mama = mama;
        this.tata = tata;
        this.dzieci = dzieci;
    }

    public int lacznaWaga() {
    return tata.getWaga()+mama.getWaga()+lacznaWagaDzieci();
    }
    public int lacznaWagaDzieci(){
        int waga = 0;
        for (int i = 0; i<dzieci.size(); i++){
            Osoba dziecko = dzieci.get(i);
          int wagaDziecka = dziecko.getWaga();
            waga += wagaDziecka;

        }
        return waga;

    }

}
