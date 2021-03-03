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
public class LuasTanah {

    double panjang, lebar;

    //modifikasi untuk nomer 3
    double tanah_terluas = 0;
    int count = 1;

    LuasTanah() {

    }

    LuasTanah(double p, double l) {
        panjang = p;
        lebar = l;
    }

    double luasTanah() {
        return panjang * lebar;
    }

    double tanahTerluas(int c, double l) { //modifikasi untuk nomer 3

        if (l > tanah_terluas) {
            tanah_terluas = l;
            count = c;
        }

        return tanah_terluas;

    }
}
