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
public class Kerucut {

    double phi = 3.14, jarijari, apotema, tinggi;

    Kerucut() {

    }

    Kerucut(double r, double s, double t) {
        jarijari = r;
        apotema = s;
        tinggi = t;
    }

    double luasPermukaan() {
        return phi * jarijari * (jarijari + apotema);
    }

    double volume() {
        return 0.3333333333333333 * phi * (jarijari * jarijari) * tinggi;
    }

}
