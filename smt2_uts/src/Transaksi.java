/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Meliusa
 */
public class Transaksi {

    public double saldo, saldoAwal, saldoAkhir;
    public String tanggalTransaksi, type;

    Transaksi(){
        
    }
    
    Transaksi(double a, double b, double c, String d, String e) {
        saldo = a;
        saldoAwal = b;
        saldoAkhir = c;
        tanggalTransaksi = d;
        type = e;
    }

    void tampil() {
        System.out.println("");
        System.out.println("Saldo : " + saldo);
        System.out.println("Saldo awal : " + saldoAwal);
        System.out.println("Saldo akhir : " + saldoAkhir);
        System.out.println("Tanggal transaksi : " + tanggalTransaksi);
    }

}
