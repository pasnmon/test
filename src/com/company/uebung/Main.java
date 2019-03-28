package com.company.uebung;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Hund h1 = new Hund("Hund1",20);
        h1.addLieblingsFutter(new String[]{"Futter1","Futter2","Futter3", "Futter4", "Futter5"});
        Hund h2 = new Hund("Hund2",25);
        h2.addLieblingsFutter(new String[]{"Futter1","Futter2","Futter3", "Futter4", "Futter5"});
        Katze k1 = new Katze("Katze1",3);
        k1.addLieblingsFutter(new String[]{"Katzenfutter1","Katzenfutter2","Katzenfutter3", "Katzenfutter4", "Katzenfutter5"});
        Tierpfleger tP1 = new Tierpfleger("Heinrich");
        Tierpfleger tP2 = new Tierpfleger("Richard");
        Tierpfleger tP3 = new Tierpfleger("Hannes");
        Tierheim t1 = new Tierheim();
        t1.addPflegeTier(h1);
        t1.addPflegeTier(k1);
        t1.addPflegeTier(h2);
        t1.addPfleger(tP1);
        t1.addPfleger(tP2);
        t1.addPfleger(tP3);
        t1.fuettereTiere();
    }
}
