/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanPraktikum;

/**
 *
 * @author Meliusa
 */
public class Bola {

    double phi = 3.14, jarijari;

    Bola() {

    }

    Bola(double r) {
        jarijari = r;
    }

    double luasPermukaan() {
        return 4 * phi * (jarijari * jarijari);
    }

    double volume() {
        return 4 / 3 * phi * (jarijari * jarijari * jarijari);
    }

}
