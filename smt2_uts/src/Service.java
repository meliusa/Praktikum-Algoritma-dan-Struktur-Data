/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Meliusa
 */
public class Service {

    Rekening[] rek = new Rekening[14];
    Transaksi[] transac = new Transaksi[14];

    public int idRekening;
    public int idTransaksi;

    void tambahRekening(Rekening r) {
        if (idRekening < rek.length) {
            rek[idRekening] = r;
            idRekening++;
        } else {
            System.out.println("Data rekening sudah penuh!");
        }
    }

    void tambahTransaksi(Transaksi t) {
        if (idTransaksi < transac.length) {
            transac[idTransaksi] = t;
            idTransaksi++;
        } else {
            System.out.println("Data transaksi sudah penuh!");
        }
    }

    void tampilRekening() {
        for (Rekening r : rek) {
            r.tampil();
            System.out.println("--------------------------");
        }
    }

    void tampilTransaksi() {
        for (Transaksi t : transac) {
            t.tampil();
            System.out.println("--------------------------");
        }
    }

    void bubbleSortTransaksi() {
        for (int i = 0; i < transac.length - 1; i++) {
            if (transac[i].saldo > 500000) {
                System.out.println("");
                System.out.println("Saldo : " + transac[i].saldo);
                System.out.println("Saldo awal : " + transac[i].saldoAwal);
                System.out.println("Saldo akhir : " + transac[i].saldoAkhir);
                System.out.println("Tanggal transaksi : " + transac[i].tanggalTransaksi);
                System.out.println("");
            }
        }
    }

    void bubbleSortRekening() {
        for (int i = 0; i < rek.length - 1; i++) {
            for (int j = 1; j < rek.length; j++) {
//                if (rek[j].namaDepan > rek[j - 1].namaDepan) {
//                    //swap
//                    Rekening tmp = rek[j];
//                    rek[j] = rek[j - 1];
//                    rek[j - 1] = tmp;
//                }

                if (rek[j].namaDepan.compareTo(rek[j - 1].namaDepan) > 0) {
                    //swap
                    Rekening temp = rek[j];
                    temp = rek[j];
                    rek[j] = rek[j - 1];
                    rek[j - 1] = temp;
                }
            }
        }
        tampilRekening();
    }

}
