package com.company.uebung;

import java.util.ArrayList;
import java.util.Random;

public class Tierheim {

    private ArrayList<Tierpfleger> pfleger = new ArrayList<>();
    private ArrayList<Pflegetier> pflegeTiere = new ArrayList<>();

    public ArrayList<Tierpfleger> getPfleger() {
        return pfleger;
    }

    public void addPfleger(Tierpfleger pfleger) {
        this.pfleger.add(pfleger);
    }

    public ArrayList<Pflegetier> getPflegeTiere() {
        return this.pflegeTiere;
    }

    public void addPflegeTier(Pflegetier pflegeTier)
    {
        this.pflegeTiere.add(pflegeTier);
    }

    public void fuettereTiere(){
        if (pfleger != null) {
            Random rnd = new Random();
            this.getPflegeTiere().forEach(x -> {

                int rndInt = rnd.nextInt(this.getPfleger().size());

                System.out.printf("Der Pfleger %s hat den Napf vorbereitet und ihm %s zum essen hingestellt.%n",
                        this.getPfleger().get(rndInt).getName(),x.getName());

                x.fressen(this.getPfleger().get(rndInt).fuelleNapf(new Futter(this.getPfleger().get(rndInt).getRndFutter(x.getLieblingsFutter()), 0.1)));
            });
        }else {
            System.out.println("Keine Pfleger vorhanden!");
        }
    }
}
