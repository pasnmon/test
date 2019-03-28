package com.company.uebung;

import java.util.ArrayList;
import java.util.HashSet;

public class Pflegetier extends Vierbeiner {

    private HashSet<String> lieblingsFutter = new HashSet<>();
    private ArrayList<String> lieblingsSpielzeug = new ArrayList<>();

    public Pflegetier(String name, double gewicht) {
        super(name, gewicht);
    }

    public void fressen(Fressnapf napf){

        if (this.getLieblingsFutter().contains(napf.getFutter())){

            this.setGewicht(this.getGewicht()+napf.getGewichtsZunahme());

            System.out.printf("%s: %s hat aus dem Fressnapf das Futter: %s gegessen und hat %.2f kg zugenommen (%.2f kg).%n",
                    this.getClass().getSimpleName(),this.getName(), napf.getFutter(), napf.getGewichtsZunahme(),this.getGewicht());

            napf = null;
        }
        else {
            System.out.printf("%s schmeckt das Futter: %s nicht und lässt es stehen.",this.getName(),napf.getFutter());
        }

    }

    public HashSet<String> getLieblingsFutter() {
        return lieblingsFutter;
    }

    public void addLieblingsFutter(String[] lieblingsFutter) {
        for (String s: lieblingsFutter) {
            this.lieblingsFutter.add(s);
        }
    }

    public ArrayList<String> getLieblingsSpielzeug() {
        return lieblingsSpielzeug;
    }
    public void setLieblingsSpielzeug(String[] lieblingsSpielzeug) {
        for (String s: lieblingsSpielzeug) {
            if (this.lieblingsSpielzeug.size() >3) {
                this.lieblingsSpielzeug.add(s);
            }
            else {
                System.out.printf("%s hat schon 3 Spielzeuge",this.getName());
            }
        }

    }


}
