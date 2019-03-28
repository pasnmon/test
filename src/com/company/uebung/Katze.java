package com.company.uebung;

import java.util.ArrayList;

public class Katze extends Pflegetier{

    private ArrayList<String> lieblingsSpielzeug = new ArrayList<>();

    private static int katzenZaehler;
    private static final String VERSION = "1.0";

    public Katze(String name, double gewicht) {
        super(name, gewicht);
        Katze.katzenZaehler++;
    }

    public void miau(){
        System.out.printf("%s: Miauuuuuu",this.getName());
    }
}
