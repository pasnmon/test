package com.company.uebung;

public class Fressnapf {

    private Futter futter;

    public Fressnapf(Futter f1) {
        this.futter = f1;
    }

    public String getFutter(){
        return this.futter.getName();
    }

    public double getGewichtsZunahme(){
        return this.futter.getGewichtsZunahme();
    }
}
