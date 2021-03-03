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
public class Mahasiswa {

    String nama, nim, jenis_kelamin, ipk;

    //modifikasi tambahan untuk nomer 5
    double ip = 0;

    Mahasiswa() {

    }

    Mahasiswa(String na, String ni, String jk, String ip) {
        nama = na;
        nim = ni;
        jenis_kelamin = jk;
        ipk = ip;
    }

    //modifikasi tambahan untuk nomer 5
    double rataRata(int jml, int i, double n) {
        if (i == jml) {
            ip += n;
            ip /= jml;
        } else {
            ip += n;
        }
        return ip;
    }

}
