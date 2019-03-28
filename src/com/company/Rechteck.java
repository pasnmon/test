package com.company;

public class Rechteck {

    protected double laenge, breite;


    public Rechteck(double laenge, double breite){
        setLaenge(laenge);
        setBreite(breite);
    }

    public double getLaenge() {
        return laenge;
    }

    public double getBreite() {
        return breite;
    }

    public void setLaenge(double laenge) {
        if(laenge <= 0 ){
            throw new IllegalArgumentException("Länge muss größer 0 sein!");
        }
        this.laenge = laenge;
    }

    public void setBreite(double breite) {
        if (breite <= 0){
            throw new IllegalArgumentException("Breite muss größer 0 sein!");
        }
        this.breite = breite;
    }

    public double getUmfang(){
        return (this.breite + this.laenge) *2 ;
    }

    public double getFlaeche(){
        return this.breite * this.laenge;
    }
}
