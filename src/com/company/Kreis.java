package com.company;

public class Kreis {

    protected double radius;

    public Kreis(double radius) {
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getFlaeche(){
        return Math.PI*(Math.pow(this.getRadius(),2));
    }

    public double getUmfang(){
        return 2*Math.PI*this.getRadius();
    }

    public double getDurchmesser(){
        return 2*this.getRadius();
    }
}
