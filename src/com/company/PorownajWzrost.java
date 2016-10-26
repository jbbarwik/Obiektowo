package com.company;

public class PorownajWzrost   {


    public static void main(String[] args) {


        Dziod tata = new Dziod("jan", "Kowalski", 35, 150, 1.95);
        Boba mama = new Boba("Barbara", "Kowalska", 35, 60, 1.70);

    public boolean czyJestWysoka(){
        if (wzrost >= 150) {
            return true;
        } else {
            return false;


        }
        System.out.println(tata.czyJestWysoka());

    }


}


