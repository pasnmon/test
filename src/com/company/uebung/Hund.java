package com.company.uebung;


import java.util.ArrayList;

public class Hund extends Pflegetier {

    private static int hundeZaehler;
    private static final String VERSION = "1.0";

    public Hund(String name, double gewicht) {
        super(name, gewicht);
        Hund.hundeZaehler ++;
    }

    public void bellen(){
        System.out.printf("%s: WUFFFF WUFFF %n",this.getName());
    }

}
