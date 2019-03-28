package com.company.uebung;

public class Futter {

    private String name;
    private Double gewichtsZunahme;


    public Futter(String name, double gewichtsZunahme) {
        this.name = name;
        this.gewichtsZunahme = gewichtsZunahme;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getGewichtsZunahme() {
        return gewichtsZunahme;
    }

    public void setGewichtsZunahme(Double gewichtsZunahme) {
        this.gewichtsZunahme = gewichtsZunahme;
    }
}
