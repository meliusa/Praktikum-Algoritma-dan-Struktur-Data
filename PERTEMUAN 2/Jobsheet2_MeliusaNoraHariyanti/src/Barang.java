/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Meliusa
 */
public class Barang {

    String nama;
    int harga_satuan, jumlah;

    //harga_satuan * jumlah
    int hitungHargaTotal(int hs, int j) {
        return hs * j;
    }

    /*
     total > 100000 -> disc 20%
     50000 ~ 100000 -> disc 10%
     < 50000 -> no disc
     */
    int hitungDiskon(int t) {
        if (t > 100000) {
            t *= 0.2; 
        } else if (t >= 50000 && t <= 100000) {
            t *= 0.1;
        }else{
            t = 0;
        }
        return t;
    }

    //menghitung total setelah dikurangi diskon
    int hitungHargaBayar(int t, int d) {
        return t - d;
    }
}
