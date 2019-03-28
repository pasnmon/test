package com.company.uebung;


import java.util.HashSet;
import java.util.Random;

public class Tierpfleger {

    private String name;

    public Tierpfleger(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Fressnapf fuelleNapf(Futter futter){
        return new Fressnapf(futter);
    }

    public String getRndFutter(HashSet<String> lieblingsFutter){
        Random rnd = new Random();
        int x = rnd.nextInt(lieblingsFutter.size());
        return lieblingsFutter.toString().replace("[","").replace("]","").split(",")[x].trim();
    }
}