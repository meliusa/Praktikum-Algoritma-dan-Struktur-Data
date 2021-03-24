/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Meliusa
 */
public class Mahasiswa {

    public String nama;
    public int thnMasuk, umur;
    public double ipk;

    Mahasiswa(String n, int t, int u, double i) {
        nama = n;
        thnMasuk = t;
        umur = u;
        ipk = i;
    }

    void tampil() {
        System.out.println("Nama : " + nama);
        System.out.println("Tahun masuk : " + thnMasuk);
        System.out.println("Umur : " + umur);
        System.out.println("Ipk : " + ipk);
    }

}
