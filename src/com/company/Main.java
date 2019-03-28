package com.company;

import com.company.uebung.Tierheim;
import com.company.uebung.Tierpfleger;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Rechteck[] rechtecke =new Rechteck[10];
        for (int i = 0; i < rechtecke.length; i++) {
            rechtecke[i] = new Rechteck(12+i,7+i);
            System.out.printf("Das Rechteck %d hat einen Umfang von: %.2f und die Fläche: %.2f%n",
                    i+1,rechtecke[i].getUmfang(),rechtecke[i].getFlaeche());
        }

        Kreis k1 = new Kreis(5);
        System.out.printf("Umfang des Kreises: %.2f%n",k1.getUmfang());
        System.out.printf("Durchmesser des Kreises: %.2f%n",k1.getDurchmesser());
        System.out.printf("Fläche des Kreises: %.2f%n",k1.getFlaeche());

        Dreieck d1 = new Dreieck(5,5,7);
        System.out.printf("Die Fläche des Dreiecks ist : %.2f und der Umfang: %.2f%n",d1.getFlaeche(),d1.getUmfang());
    }
}
