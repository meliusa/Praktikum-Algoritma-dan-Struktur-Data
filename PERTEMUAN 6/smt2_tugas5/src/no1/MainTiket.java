/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no1;

/**
 *
 * @author Meliusa
 */
public class MainTiket {

    public static void main(String[] abcd) {
        TiketService tikets = new TiketService();
        Tiket t1 = new Tiket("Citilink", 1000000, "Malang", "Cipanas");
        Tiket t2 = new Tiket("Garuda Indonesia", 3000000, "Malang", "Bandung");
        Tiket t3 = new Tiket("Kal Star", 1500000, "Malang", "Cipanas");
        Tiket t4 = new Tiket("Sriwijaya", 2000000, "Malang", "Bandung");
        Tiket t5 = new Tiket("Lion Air", 5000000, "Malang", "Cipanas");

        tikets.tambah(t1);
        tikets.tambah(t2);
        tikets.tambah(t3);
        tikets.tambah(t4);
        tikets.tambah(t5);

        tikets.bubbleSort();
        tikets.tampilAll();

    }
}
