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
public class Kubus {

    double sisi;

    Kubus() {

    }

    Kubus(double s) {
        sisi = s;
    }

    double luasPermukaan() {
        return 6 * (sisi * sisi);
    }

    double volume() {
        return sisi * sisi * sisi;
    }

}
