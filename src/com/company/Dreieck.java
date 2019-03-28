package com.company;

public class Dreieck {

    protected double a;
    protected double b;
    protected double c;

    public Dreieck(double a, double b, double c) {
        setA(a);
        setB(b);
        setC(c);
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getFlaeche(){
        return (this.getA()*this.getHoehe()) /2;
    }

    public double getUmfang(){
        return this.getA()+this.getB()+this.getC();
    }

    public double getAlpha(){
        return (Math.toDegrees(Math.acos((((-0.5*Math.pow(this.getA(),2))+(0.5*Math.pow(this.getB(),2))+(0.5*Math.pow(this.getC(),2))) /
                (this.getB()*this.getC())))));
    }

    public double getBeta(){
        return (Math.toDegrees(Math.acos(( (0.5*Math.pow(this.getA(),2) - 0.5*Math.pow(this.getB(),2) + 0.5*Math.pow(this.getC(),2))) /
                (this.getA()*this.getC()))));
    }

    public double getGamma(){
        return 180-this.getAlpha()-this.getBeta();
    }

    public double getHoehe(){
        return this.getB() * (Math.sin(Math.toRadians(this.getGamma())));
    }
}
